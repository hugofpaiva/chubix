import java.util.HashMap;
import java.io.*;
import java.text.CharacterIterator;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Iterator;
import java.util.ArrayList;

public class SemanticChubix extends chubixBaseVisitor<Boolean> {
   private final VoidType voidType = new VoidType();
   private final IntegerType integerType = new IntegerType();
   private final DoubleType doubleType = new DoubleType();
   private final BooleanType booleanType = new BooleanType();
   private final StringType stringType = new StringType();
   private final DimensionsType dimensionType = new DimensionsType("", new HashMap<>(), new DoubleType());
   private  dimensionsParser dimensionsParser;
   
   @Override public Boolean visitMain(chubixParser.MainContext ctx) { 
      visitChildren(ctx);
      if(ctx.instList()!=null)
         chubixParser.current = chubixParser.current.parent();   // up

      return true;
   }

   @Override public Boolean visitImportDim(chubixParser.ImportDimContext ctx){
      Boolean res = true;
      String fileName = ctx.FILENAME().getText();
      InputStream in_stream = null;
      CharStream input = null;
      try {
         in_stream = new FileInputStream(new File(fileName));
         input = CharStreams.fromStream(in_stream);
      } catch (IOException e) {
         ErrorHandling.printError(ctx, "ERROR: reading file!");
         res = false;
      }
      if (res) {
         dimensionsLexer lexer = new dimensionsLexer(input);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         dimensionsParser = new dimensionsParser(tokens);
         ParseTree tree = dimensionsParser.main();
   
         if (dimensionsParser.getNumberOfSyntaxErrors() == 0) {
            DimSemantic visitor0 = new DimSemantic();
            visitor0.visit(tree);
         }
      }
      return res;
   }

   @Override public Boolean visitInstList(chubixParser.InstListContext ctx) {
      Boolean res = true;
      if(chubixParser.current.parent()==null)
         chubixParser.current = chubixParser.current.addChild();   // down
      
      Iterator<chubixParser.InstructionContext> instList = ctx.instruction().iterator();
      while (instList.hasNext()) {
         res &= visit(instList.next());
      }

      return res;
   }
   
   @Override public Boolean visitInstruction(chubixParser.InstructionContext ctx) {
      return visitChildren(ctx);
   }
   
   @Override public Boolean visitPrint(chubixParser.PrintContext ctx) {
      Boolean res = true;
      if (ctx.expr()!=null)
         res = visit(ctx.expr());
      return res;
   }
      
   @Override public Boolean visitReturnFunc(chubixParser.ReturnFuncContext ctx) {      
      if (ctx.expr()==null)
         ctx.ret = voidType;
      else {
         Boolean res = visit(ctx.expr());
         if(!res)
            return false;
         ctx.ret = ctx.expr().exprType;
      }
      return true;
   }

   @Override public Boolean visitFunction(chubixParser.FunctionContext ctx) {
      Boolean res = visit(ctx.ret_type);
      if(!res)
         return false;

      String idFunc = ctx.func_name.getText();
      if (chubixParser.global.contains(idFunc)) {
         ErrorHandling.printError(ctx, "Function \""+idFunc+"\" already exists!");
         return false;
      }

      Symbol sym = new Symbol(idFunc, new FunctionType(ctx.ret_type.res));
      chubixParser.global.addSymbol(idFunc, sym);
      chubixParser.current = chubixParser.current.addChild();                       // down

      for(int i=0;i<ctx.declare().size();i++){
         res &= visit(ctx.declare(i));
         ((FunctionType)sym.type()).addArg(ctx.declare(i).type().res);
      }
      for (Symbol s : chubixParser.current.symbols().values())
         s.setValueDefined();

      if(!visit(ctx.instList())) res = false;

      if(!visit(ctx.returnFunc())) res = false;

      if(!res)
         return false;

      if (!ctx.returnFunc().ret.conformsTo(ctx.ret_type.res)) {
         ErrorHandling.printError(ctx, "Function of Type "+ ctx.ret_type.res.name() +" cannot return "+ ctx.returnFunc().ret.name());
         return false;
      }
      
      chubixParser.current = chubixParser.current.parent();  // up
      return res;
   }

   @Override public Boolean visitCallFunction(chubixParser.CallFunctionContext ctx) {
      String id = ctx.func_name.getText();
      if (!chubixParser.global.symbols().containsKey(id)) {
         ErrorHandling.printError(ctx, "Function "+id+" does not exist.");
         return false;
      }
      Boolean res = true;
      ArrayList<Type> func_args = ((FunctionType) chubixParser.global.symbols().get(id).type()).getArgs();
      if (ctx.expr().size()==func_args.size()){
         for(int i=0;i<ctx.expr().size();i++){
            res&=visit(ctx.expr(i));
            if(!res)
               return false;
            if (!ctx.expr(i).exprType.conformsTo(func_args.get(i))) {
               ErrorHandling.printError(ctx, "Cannot match argument passed to function "+id+".");
               res = false;
            } else if (ctx.expr(i).exprType.isDimensional() && func_args.get(i).isDimensional()) {
               if ( !((DimensionsType) func_args.get(i)).getUnit().equals(((DimensionsType) ctx.expr(i).exprType).getUnit())) {
                  ErrorHandling.printError(ctx, "Incomparable types: " + DimensionsType.mapToString(((DimensionsType) ctx.expr(i).exprType).getUnit()) + " and " + DimensionsType.mapToString(((DimensionsType) func_args.get(i)).getUnit()));
                  res = false;
               }
            }
         }
      } else {
         ErrorHandling.printError(ctx, "Number of arguments do not match.");
         return false;
      }

      return res;
   }

   @Override public Boolean visitAssignment(chubixParser.AssignmentContext ctx) {
      Boolean res = visit(ctx.expr());
      String id = ctx.ID().getText();
      Symbol sym;
      if (res) {
         if ((sym=chubixParser.current.lookup(id)) == null) {
            ErrorHandling.printError(ctx, "Variable \""+id+"\" does not exist!");
            return false;
         }
         if (!ctx.expr().exprType.conformsTo(sym.type())) {
            ErrorHandling.printError(ctx, "Expression type does not conform to variable \""+id+"\" type!");
            res = false;
         } else if (sym.type().isDimensional() && ctx.expr().exprType.isDimensional()) {
            if ( !((DimensionsType)sym.type()).getUnit().equals(((DimensionsType) ctx.expr().exprType).getUnit())) {
               ErrorHandling.printError(ctx, "Incomparable types: " + DimensionsType.mapToString(((DimensionsType) sym.type()).getUnit()) + " and " + DimensionsType.mapToString(((DimensionsType) ctx.expr().exprType).getUnit()));
               return false;
            }
            if (((DimensionsType)sym.type()).getType().name().equals("integer") && ((DimensionsType) ctx.expr().exprType).getType().name().equals("double")) {
               ErrorHandling.printError(ctx, "Cannot convert Double to a Dimension of Integers!");
               return false;
            }
            sym.setValueDefined();
         } else
            sym.setValueDefined();
      }
      return res;
   }

   @Override public Boolean visitDeclAssig(chubixParser.DeclAssigContext ctx) {
      Boolean res = visit(ctx.declare()) && visit(ctx.expr());     
      if (!res)
         return false;

      String id = ctx.declare().ID().getText();

      Symbol sym = chubixParser.current.lookup(id);
      
      if (!ctx.expr().exprType.conformsTo(sym.type())) {
         ErrorHandling.printError(ctx, "Expression type does not conform to variable \""+id+"\" type!");
         return false;
      } else if (sym.type().isDimensional() && ctx.expr().exprType.isDimensional()) {
         if ( !((DimensionsType)sym.type()).getUnit().equals(((DimensionsType) ctx.expr().exprType).getUnit())) {
            ErrorHandling.printError(ctx, "Incomparable types: " + DimensionsType.mapToString(((DimensionsType) sym.type()).getUnit()) + " and " + DimensionsType.mapToString(((DimensionsType) ctx.expr().exprType).getUnit()));
            return false;
         }
         if (((DimensionsType)sym.type()).getType().name().equals("integer") && ((DimensionsType) ctx.expr().exprType).getType().name().equals("double")) {
            ErrorHandling.printError(ctx, "Cannot convert Double to a Dimension of Integers!");
            return false;
         }
         sym.setValueDefined();
      } else
         sym.setValueDefined();

      return res;
   }

   @Override public Boolean visitDeclare(chubixParser.DeclareContext ctx) {
      Boolean res = visit(ctx.type());
      if(!res)
         return false;

      String id = ctx.ID().getText();

      if (chubixParser.current.lookup(id)!=null) {
         ErrorHandling.printError(ctx, "Variable \""+id+"\" already declared!");
         return false;
      } else 
         chubixParser.current.put(id, new Symbol(id, ctx.type().res));   

      return res;
   }

   @Override public Boolean visitConditional(chubixParser.ConditionalContext ctx) {
      Boolean res = visit(ctx.expr());
      chubixParser.current = chubixParser.current.addChild();      // down
      visit(ctx.trueSL); // ignores result on purpose (to avoid override of all visit*)!
      chubixParser.current = chubixParser.current.parent();         // up
      if (ctx.falseSL != null)
         visit(ctx.falseSL); // ignores result on purpose (to avoid override of all visit*)!
      if (res) {
         if (!"boolean".equals(ctx.expr().exprType.name())) {
            ErrorHandling.printError(ctx, "Boolean expression required in conditional instruction!");
            res = false;
         }
      }
      return res;
   }

   @Override public Boolean visitConditionalElse(chubixParser.ConditionalElseContext ctx) { 
      return visit(ctx.conditional());
   }

   

   @Override public Boolean visitInstElse(chubixParser.InstElseContext ctx) {
      chubixParser.current = chubixParser.current.addChild();        // down
      Boolean res = visit(ctx.instList());
      chubixParser.current = chubixParser.current.parent();          // up
      return res;
   }

   @Override public Boolean visitForLoop(chubixParser.ForLoopContext ctx) {
      // 'for' '(' declAssig|var=assignment ';' varBreak= expr ';' varInc=assignment ')' '{' instList '}'
      Boolean res;
      chubixParser.current = chubixParser.current.addChild();        // down 
      if (ctx.declAssig()!=null)
         res = visit(ctx.declAssig());
      else
         res = visit(ctx.var);
       
      res = res && visit(ctx.varBreak) && visit(ctx.varInc);

      if(res){
         if(!ctx.varBreak.exprType.conformsTo(booleanType)){
            ErrorHandling.printError(ctx, "Break Condition \""+ctx.varBreak.getText()+"\" isn't a Boolean expression!");
            return false;
         }
      } else
         return res;
      visit(ctx.instList()); // ignores result on purpose (to avoid override of all visit*)!
      chubixParser.current = chubixParser.current.parent();          // up
      return res;
   }

   @Override public Boolean visitWhileLoop(chubixParser.WhileLoopContext ctx) {
      //whileLoop : 'while' '(' expr ')' '{' condSL=instList '}';
      chubixParser.current = chubixParser.current.addChild();        // down 
      Boolean res = visit(ctx.expr());
      if(res){
         if(!ctx.expr().exprType.conformsTo(booleanType)){
            ErrorHandling.printError(ctx, "Condition \""+ctx.expr().getText()+"\" isn't a Boolean expression!");
            return false;
         }
      } else {
         return res;
      }
      visit(ctx.condSL); // ignores result on purpose (to avoid override of all visit*)!
      chubixParser.current = chubixParser.current.parent();          // up
      return res;
   }

   @Override public Boolean visitBreakLoop(chubixParser.BreakLoopContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitContinueLoop(chubixParser.ContinueLoopContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitVoidType(chubixParser.VoidTypeContext ctx) { 
      ctx.res = voidType;
      return true;
   }
   
   @Override public Boolean visitIntType(chubixParser.IntTypeContext ctx) {
      ctx.res = integerType;
      return true;
   }

   @Override public Boolean visitDoubleType(chubixParser.DoubleTypeContext ctx) {
      ctx.res = doubleType;
      return true;
   }

   @Override public Boolean visitBoolType(chubixParser.BoolTypeContext ctx) {
      ctx.res = booleanType;
      return true;
   }

   @Override public Boolean visitStrType(chubixParser.StrTypeContext ctx) {
      ctx.res = stringType;
      return true;
   }

   @Override public Boolean visitDimensionType(chubixParser.DimensionTypeContext ctx) {
      String id = ctx.ID().getText();

      if (!dimensionsParser.dimTable.containsKey(id)) {
         ErrorHandling.printError(ctx, "Dimension \"" + id + "\" does not exist.");
         return false;
      }
      
      HashMap<String, Integer> unit = new HashMap<>();
      unit.putAll(dimensionsParser.dimTable.get(id).getUnit());  // .is
      ctx.res = new DimensionsType("", unit, dimensionsParser.dimTable.get(id).getType()); 
      
      return true;
   }

   @Override public Boolean visitAddSubExpr(chubixParser.AddSubExprContext ctx) {
      Boolean res = visit(ctx.e1) && visit(ctx.e2);
      if (res) {
         ctx.exprType = fetchType(ctx.e1.exprType, ctx.e2.exprType);
         if (ctx.e1.exprType.isDimensional() && ctx.e2.exprType.isDimensional()) {
            if ( !((DimensionsType)ctx.e1.exprType).getUnit().equals(((DimensionsType) ctx.e2.exprType).getUnit())) {
               ErrorHandling.printError(ctx, "Incomparable types: " + DimensionsType.mapToString(((DimensionsType) ctx.e1.exprType).getUnit()) + " and " + DimensionsType.mapToString(((DimensionsType) ctx.e2.exprType).getUnit()));
               res = false;
            }
         }
      }
      return res; // (1+m)/10 ->  m^1 * 10^-1 + 1 * 10^-1
   }

   @Override public Boolean visitDoubleExpr(chubixParser.DoubleExprContext ctx) { 
      ctx.exprType = doubleType;
      return true;
   }

  
   @Override public Boolean visitExprConvUnit(chubixParser.ExprConvUnitContext ctx) {
      Boolean res = visit(ctx.expr()) && visit(ctx.unitdim());
      if (!res)
         return false;
      DimensionsType type = checkUnit(ctx.unitdim().unitdimType.getUnit());
      // m ->0.001 
      if (type == null) {
         ErrorHandling.printError(ctx, "Dimension \"" + ctx.unitdim().getText() + "\" does not exist!");
         return false;
      }
      if (ctx.expr().exprType.isDimensional()) {
         if (!((DimensionsType) ctx.expr().exprType).getUnit().equals(type.getUnit())){
            ErrorHandling.printError(ctx, "Cannot convert to another Dimension!");
            return false;
         }
      } else {
         if (ctx.expr().exprType.name().equals("double") && type.getType().name().equals("integer")) {
            ErrorHandling.printError(ctx, "Cannot convert Double to a Dimension of Integers!");
            return false;
         }
      }
      ctx.exprType = type;
      return true;
   }// fazer o mesmo para o dimensions


   @Override public Boolean visitIntegerExpr(chubixParser.IntegerExprContext ctx) {
      ctx.exprType = integerType;
      return true;
   }

   @Override public Boolean visitBooleanExpr(chubixParser.BooleanExprContext ctx) {
      ctx.exprType = booleanType;
      return true;
   }

   @Override public Boolean visitInputExpr(chubixParser.InputExprContext ctx) {
      Boolean res = visit(ctx.type());
      if (!res)
         return false;
      ctx.exprType = ctx.type().res;
      return true;
   }

   @Override public Boolean visitParenExpr(chubixParser.ParenExprContext ctx) {
      Boolean res = visit(ctx.expr());
      if (res)
         ctx.exprType = ctx.expr().exprType;
      return res;
   }

   @Override public Boolean visitFunctionExpr(chubixParser.FunctionExprContext ctx) {
      Boolean res=visit(ctx.callFunction());
      if (!res)
         return false;
      String id = ctx.callFunction().func_name.getText();
      Type type = ((FunctionType)chubixParser.global.symbols().get(id).type()).getType();
      if (type.name().equals("void")) {
         ErrorHandling.printError(ctx, "Expression cannot be void");
         return false;
      }
      
      ctx.exprType= type;
                                                                                                                       
      return res;
   }

   @Override public Boolean visitStringExpr(chubixParser.StringExprContext ctx) {
      ctx.exprType = stringType;
      return true;
   }

   @Override public Boolean visitDoubleSumMin(chubixParser.DoubleSumMinContext ctx) { 
      Boolean res = visit(ctx.ID());    
      ctx.exprType = chubixParser.current.lookup(ctx.ID().getText()).type();          
      return res;
   }

   @Override public Boolean visitSignExpr(chubixParser.SignExprContext ctx) {
      Boolean res = visit(ctx.expr()) && checkNumericType(ctx, ctx.expr().exprType);
      if (res) 
         ctx.exprType = ctx.expr().exprType;
      return res;
   }

   @Override public Boolean visitMultDivRestExpr(chubixParser.MultDivRestExprContext ctx) {
      Boolean res = visit(ctx.e1) && checkNumericType(ctx, ctx.e1.exprType) && 
                    visit(ctx.e2) && checkNumericType(ctx, ctx.e2.exprType);
      if (res) {
         
         if (ctx.e1.exprType.isDimensional() && ctx.e2.exprType.isDimensional()) {
            HashMap<String,Integer> map_1 = ((DimensionsType) ctx.e1.exprType).getUnit(); ////// VER ISTO
            HashMap<String,Integer> map_2 = ((DimensionsType) ctx.e2.exprType).getUnit();
            HashMap<String,Integer> map1 = new HashMap<String,Integer>();
            map1.putAll(map_1);
            HashMap<String,Integer> map2 = new HashMap<String,Integer>();
            map2.putAll(map_2);

            //Type dim = null;
            switch(ctx.op.getText()) {
               case "*":
                  map2.forEach((k, v) -> map1.merge(k, v, (v1, v2) -> v1 + v2));
                  map1.values().removeIf(f -> f == 0f);
                 // dim = checkUnit(map1);
                  break;
               case "/":
                  map2.forEach((k, v) -> map2.put(k,-v));
                  map2.forEach((k, v) -> map1.merge(k, v, (v1, v2) -> v1 + v2));
                  map1.values().removeIf(f -> f == 0f);          
                 // dim = checkUnit(map1);
                  break;
            }

            if (map1.isEmpty())
               ctx.exprType = fetchType(((DimensionsType) ctx.e1.exprType).getType(), ((DimensionsType) ctx.e2.exprType).getType());
            else
               ctx.exprType = new DimensionsType("", map1, fetchType(((DimensionsType) ctx.e1.exprType).getType(), ((DimensionsType) ctx.e2.exprType).getType()));
               
         } else if (ctx.e1.exprType.isDimensional()) {
            ctx.exprType = ctx.e1.exprType;
         } else if (ctx.e2.exprType.isDimensional()) {
            ctx.exprType = ctx.e2.exprType;
         } else
            ctx.exprType = fetchType(ctx.e1.exprType, ctx.e2.exprType);

      }
      if (ctx.exprType == null) {
         ErrorHandling.printError(ctx, "Cannot fetch a type between " + ctx.e1.getText() + " and "+ctx.e2.getText() );
         return false;
      }
      return res;
   }

   @Override public Boolean visitPowExpr(chubixParser.PowExprContext ctx) {
      Boolean res = visit(ctx.e1) && checkNumericType(ctx, ctx.e1.exprType) &&
                    visit(ctx.e2) && checkNumericType(ctx, ctx.e2.exprType) && (!ctx.e2.exprType.isDimensional());
      if (res){
         if (ctx.e1.exprType.isDimensional()) {
            if (ctx.e2.exprType.name().equals("double")){
               ErrorHandling.printError(ctx, "Dimension cannot be powered to non-integer types!");
               return false;
            }
            int i = Integer.parseInt(ctx.e2.getText());
            if(i==0){
               ErrorHandling.printError(ctx, "Power of 0 is not possible when defining a unit");
               return false;
               //ErrorHandling.printWarning(ctx, "Power of 0 is dumb when defining a unit");
               //ctx.exprType = integerType;//queres meter isto a dar? mas opa n sei se é fodido dps, 
            }
            HashMap<String,Integer> unit = new HashMap<>();
            unit.putAll(((DimensionsType)ctx.e1.exprType).getUnit());
            unit.forEach((k, v) -> {
               unit.put(k, (int) (v*i));
            });
            ctx.exprType = new DimensionsType("", unit, ((DimensionsType)ctx.e1.exprType).getType());
         } else
            ctx.exprType = fetchType(ctx.e1.exprType, ctx.e2.exprType); 
      }
      if (ctx.exprType == null){
         ErrorHandling.printError(ctx, "Cannot fetch a type between " + ctx.e1.getText() + " and "+ctx.e2.getText() );
         return false;
      }

      return res;                                                  
   }

   @Override public Boolean visitConditionalExpr(chubixParser.ConditionalExprContext ctx) {
      Boolean res = visit(ctx.e1) && visit(ctx.e2);
      String op = ctx.op.getText();
      if (!res)
         return false;
           
      if (!ctx.e1.exprType.conformsTo(ctx.e2.exprType)) {      
         ErrorHandling.printError(ctx, "Incomparable types: " + ctx.e1.getText() + " and " + ctx.e2.getText());
         return false;
      }
      
      if  (ctx.e1.exprType == stringType && ctx.e2.exprType == stringType && !(op.equals("==")) && !(op.equals("!="))){
         ErrorHandling.printError(ctx, "Incomparable types: " + ctx.e1.getText() + " and " + ctx.e2.getText());           
         return false;
      }

      if (ctx.e1.exprType.isDimensional() && ctx.e2.exprType.isDimensional()) {
         if ( !((DimensionsType)ctx.e1.exprType).getUnit().equals(((DimensionsType) ctx.e2.exprType).getUnit())) {
            ErrorHandling.printError(ctx, "Incomparable types: " + DimensionsType.mapToString(((DimensionsType) ctx.e1.exprType).getUnit()) + " and " + DimensionsType.mapToString(((DimensionsType) ctx.e2.exprType).getUnit()));
            return false;
         }
      }
      
      if (res)
         ctx.exprType = booleanType;
       
      return res;     
   }

   @Override public Boolean visitIdExpr(chubixParser.IdExprContext ctx) {
      String id = ctx.ID().getText();
      Symbol sym;
         if ((sym = chubixParser.current.lookup(id)) == null) {
            ErrorHandling.printError(ctx, "Variable \""+id+"\" does not exist!");
            return false;
         }sym = chubixParser.current.lookup(id);
    
      if (!sym.valueDefined()) {
         ErrorHandling.printError(ctx, "Variable \""+id+"\" not defined!");
         return false;
      } else
         ctx.exprType = sym.type();
      return true;
   }


   @Override public Boolean visitDimPower(chubixParser.DimPowerContext ctx) {
      Boolean res =  visit(ctx.unitdim());
      
      if (!res)
         return false;

      int i;
      if (ctx.op != null) 
         i = Integer.parseInt(ctx.op.getText()+ctx.INTEGER().getText());
      else
         i = Integer.parseInt(ctx.INTEGER().getText());
      
      if(i==0){
         ErrorHandling.printError(ctx, "Power of 0 is not possible when defining a unit");
         return false;
      }

      DimensionsType dim1 = ctx.unitdim().unitdimType;
      HashMap<String,Integer> map1 = dim1.getUnit();

      map1.forEach((k, v) -> {
         map1.put(k, (int) map1.get(k)*i);
      });

      dim1.setUnit(map1);
     
      ctx.unitdimType = dim1;

      return res;
   }
   
   @Override public Boolean visitDimUnn(chubixParser.DimUnnContext ctx) {
      Boolean res = visit(ctx.unitdim());
      if (!res)
         return false;
      ctx.unitdimType = ctx.unitdim().unitdimType;
      return res;
   }

   @Override public Boolean visitDimMultDiv(chubixParser.DimMultDivContext ctx) {
      Boolean res =  visit(ctx.unitdim(0)) &&  visit(ctx.unitdim(1));
      if (!res)
         return false;
      DimensionsType dim1 = ctx.unitdim(0).unitdimType;
      DimensionsType dim2 = ctx.unitdim(1).unitdimType;
      HashMap<String,Integer> map1 = dim1.getUnit();
      HashMap<String,Integer> map2 = dim2.getUnit();
      double value = 0.0;
      switch(ctx.op.getText()){
         case "*":
            value = dim1.getUnitConv(map1)*dim2.getUnitConv(map2);
            map1.forEach((k, v) -> map2.merge(k, v, (v1, v2) -> v1 + v2)); // m*kg*s^-2
            map2.values().removeIf(f -> f == 0f);
            ctx.unitdimType = new DimensionsType("", map2, fetchType(dim1.getType(), dim2.getType()), value);
            break;
         case "/":
            value = dim1.getUnitConv(map1)/dim2.getUnitConv(map2);
            map2.forEach((k, v) -> map2.put(k,-v));
            map2.forEach((k, v) -> map1.merge(k, v, (v1, v2) -> v1 + v2));
            map1.values().removeIf(f -> f == 0f);
            ctx.unitdimType = new DimensionsType("", map1, fetchType(dim1.getType(),dim2.getType()), value);
            break;
      }
      return res;
   }

   @Override public Boolean visitDimID(chubixParser.DimIDContext ctx) {
      String unit = ctx.ID().getText();
      HashMap<String, Integer> unitmap = new HashMap<>();
      unitmap.put(unit, 1);
      
      ctx.unitdimType = checkUnit(unitmap);
      
      if (ctx.unitdimType==null) {
         ErrorHandling.printError(ctx, "There is no dimension with that unit!");
         return false;
      }
      return true;
   }

   private Boolean checkNumericType(chubixParser.ExprContext ctx, Type t) {
      if (!t.isNumeric()) {
         ErrorHandling.printError(ctx, "Numeric operator applied to a non-numeric operand!");
         return false;
      }
      return true;
   }

   private Type fetchType(Type t1, Type t2) {
      Type res = null;
      
      if (t1.isNumeric() && t2.isNumeric())
      {
         if ("double".equals(t1.name()))
            res = t1;
         else if ("double".equals(t2.name()))
            res = t2;
         else
            res = t1;
      }
      else if ("boolean".equals(t1.name()) && "boolean".equals(t2.name()))
         res = t1;
      else if ("string".equals(t1.name()) && "string".equals(t2.name()))
         res = t1;
      return res;
   }

   private DimensionsType checkUnit(HashMap<String,Integer> map){ 
     for (DimensionsType dimType : dimensionsParser.dimTable.values()) {
         if (dimType.containsUnit(map)){ // km 
            HashMap<String, Integer> unit = new HashMap<>();
            unit.putAll(dimType.getUnit());//m                       // m / km  0.001
            return new DimensionsType("", unit, dimType.getType(), 1 /dimType.getUnitConv(map));
         }
     }
     return null;
   }
   
}