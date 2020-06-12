import java.util.HashMap;

public class SemanticChubix extends chubixBaseVisitor<Boolean> {
   private final DoubleType doubleType = new DoubleType();
   private final IntegerType integerType = new IntegerType();
   private final BooleanType booleanType = new BooleanType();
   private final StringType stringType = new StringType();
   private final DimensionsType dimensionType = new DimensionsType("", new HashMap<>(), new DoubleType());
   
   @Override public Boolean visitMain(chubixParser.MainContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitInstList(chubixParser.InstListContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitInstruction(chubixParser.InstructionContext ctx) {
      return visitChildren(ctx);
   }

   // @Override public Boolean visitPrint(chubixParser.PrintContext ctx) {
   //    return visitChildren(ctx);
   // }

   @Override public Boolean visitReturnFunc(chubixParser.ReturnFuncContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitFunction(chubixParser.FunctionContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitCallFunction(chubixParser.CallFunctionContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitAssignment(chubixParser.AssignmentContext ctx) {
      Boolean res = visit(ctx.expr());
      String id = ctx.ID().getText();
      if (res) {
         if (!chubixParser.symbolTable.containsKey(id)) {
            ErrorHandling.printError(ctx, "Variable \""+id+"\" does not exists!");
            res = false;
         } else {
            Symbol sym = chubixParser.symbolTable.get(id);
            if (!ctx.expr().exprType.conformsTo(sym.type())) {
               ErrorHandling.printError(ctx, "Expression type does not conform to variable \""+id+"\" type!");
               res = false;
            } else
               sym.setValueDefined();
         }
      }
      return res;
   }

   @Override public Boolean visitDeclAssig(chubixParser.DeclAssigContext ctx) {
      Boolean res = visit(ctx.expr());
      String id = ctx.declare().getText();
      Symbol sym = new Symbol(id, ctx.declare().type().res);
            
      if (res) {
         if (chubixParser.symbolTable.containsKey(id)) {
            ErrorHandling.printError(ctx, "Variable \""+id+"\" already declared!");
            res = false;
         } else {
            chubixParser.symbolTable.put(id, sym);
         }
         if (!ctx.expr().exprType.conformsTo(sym.type())) {
            ErrorHandling.printError(ctx, "Expression type does not conform to variable \""+id+"\" type!");
            res = false;
         } else
            sym.setValueDefined();
      }
      return res;
   }

   @Override public Boolean visitDeclare(chubixParser.DeclareContext ctx) {
      Boolean res = true;
      //visit(ctx.type());
      String id = ctx.ID().getText();

      if (chubixParser.symbolTable.containsKey(id)) {
         ErrorHandling.printError(ctx, "Variable \""+id+"\" already declared!");
         res = false;
      } else
         chubixParser.symbolTable.put(id, new Symbol(id, ctx.type().res));
      return res;
   }

   @Override public Boolean visitConditional(chubixParser.ConditionalContext ctx) {
      Boolean res = visit(ctx.expr());
      visit(ctx.trueSL); // ignores result on purpose (to avoid override of all visit*)!
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
      return visit(ctx.instList());
   }

   @Override public Boolean visitForLoop(chubixParser.ForLoopContext ctx) {
      // 'for' '(' declAssig|var=assignment ';' varBreak= expr ';' varInc=assignment ')' '{' instList '}'
      Boolean res;
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
      visit(ctx.instList());
      return res;
   }

   @Override public Boolean visitWhileLoop(chubixParser.WhileLoopContext ctx) {
      //whileLoop : 'while' '(' expr ')' '{' condSL=instList '}';
      Boolean res = visit(ctx.expr());
      if(res){
         if(!ctx.expr().exprType.conformsTo(booleanType)){
            ErrorHandling.printError(ctx, "Condition \""+ctx.expr().getText()+"\" isn't a Boolean expression!");
            return false;
         }
      } else{
         return res;
      }
      visit(ctx.condSL);
      return res;
   }

   @Override public Boolean visitBreakLoop(chubixParser.BreakLoopContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitContinueLoop(chubixParser.ContinueLoopContext ctx) {
      return visitChildren(ctx);
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
      Boolean res = true;
      String id = ctx.ID().getText();
      if (!dimensionsParser.dimTable.containsKey(id)) {
         res = false;
      }
      
      if (res)
         ctx.res = dimensionsParser.dimTable.get(id);
      
      return res;
   }

   @Override public Boolean visitDoubleExpr(chubixParser.DoubleExprContext ctx) {
      ctx.exprType = doubleType;
      if (ctx.unitdim() != null) {
         ctx.exprType = checkUnit(ctx.unitdim().unitdimType.getUnit());
         if (ctx.exprType == null) {
            ErrorHandling.printError(ctx, "Dimension \"" + ctx.unitdim().getText() + "\" does not exist!");
            return false;
         }
      }
      return true;
   }

   @Override public Boolean visitAddSubExpr(chubixParser.AddSubExprContext ctx) {
      Boolean res = visit(ctx.e1) && visit(ctx.e2);
      if (res) {
         ctx.exprType = fetchType(ctx.e1.exprType, ctx.e2.exprType);
         if (ctx.e1.exprType.isDimensional() && ctx.e2.exprType.isDimensional()) {
            if (ctx.e1.exprType.conformsTo(ctx.e2.exprType))
               ctx.exprType = ctx.e1.exprType;
            else{
               ErrorHandling.printError(ctx, "Cannot add different dimensions!");
               return false;
            }
         }
      }
      return res;
   }

   @Override public Boolean visitIntegerExpr(chubixParser.IntegerExprContext ctx) {
      ctx.exprType = integerType;
      if (ctx.unitdim() != null) {
         ctx.exprType = checkUnit(ctx.unitdim().unitdimType.getUnit());
         if (ctx.exprType == null) {
            ErrorHandling.printError(ctx, "Dimension \"" + ctx.unitdim().getText() + "\" does not exist!");
            return false;
         }
      }
      return true;
   }

   @Override public Boolean visitBooleanExpr(chubixParser.BooleanExprContext ctx) {
      ctx.exprType = booleanType;
      return true;
   }

   @Override public Boolean visitInputExpr(chubixParser.InputExprContext ctx) {
      if (ctx.unitdim() != null) {
         // associar o dimension type ao ctx
         Type dim = checkUnit(ctx.unitdim().unitdimType.getUnit());
         if (dim==null){
            ErrorHandling.printError(ctx, "Dimension \"" + ctx.unitdim().getText() + "\" does not exist!");
            return false;
         } else
            ctx.exprType = dim;
      } else
         ctx.exprType = stringType;
      return true;
   }

   @Override public Boolean visitParenExpr(chubixParser.ParenExprContext ctx) {
      Boolean res = visit(ctx.expr());
      if (res)
         ctx.exprType = ctx.expr().exprType;
      return res;
   }

   @Override public Boolean visitFunctionExpr(chubixParser.FunctionExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitStringExpr(chubixParser.StringExprContext ctx) {
      ctx.exprType = stringType;
      return true;
   }

   @Override public Boolean visitDoubleSumMin(chubixParser.DoubleSumMinContext ctx) {
      if (!chubixParser.symbolTable.containsKey(ctx.ID().getText())) {
         ErrorHandling.printError(ctx, "Variable \""+ctx.ID().getText()+"\" does not exists!");
         return false;
      }
      ctx.exprType = chubixParser.symbolTable.get(ctx.ID().getText()).type();
      return true;
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
         ctx.exprType = fetchType(ctx.e1.exprType, ctx.e2.exprType);
         if (ctx.e1.exprType.isDimensional() && ctx.e2.exprType.isDimensional() && ctx.e1.exprType.conformsTo(ctx.e2.exprType)) {
            HashMap<String,Integer> map1 = ((DimensionsType) ctx.e1.exprType).getUnit();
            HashMap<String,Integer> map2 = ((DimensionsType) ctx.e2.exprType).getUnit();

            switch(ctx.op.getText()){
               case "*":
                  map1.forEach((k, v) -> map2.merge(k, v, (v1, v2) -> v1 + v2));
                  map1.forEach((k, v) -> { map2.putIfAbsent(k, v); });
                  map2.values().removeIf(f -> f == 0f);
                  break;
               case "/":
                  map1.forEach((k, v) -> map2.merge(k, v, (v1, v2) -> v1 - v2));
                  map1.forEach((k, v) -> {
                     map2.putIfAbsent(k, v);
                  });
                  map2.values().removeIf(f -> f == 0f);
                  break;
            }
            Type dim = checkUnit(map2);

            if (dim != null)
               ctx.exprType = dim;
            else
               ctx.exprType = new DimensionsType("", map2, fetchType(((DimensionsType) ctx.e1.exprType).getType(), ((DimensionsType) ctx.e2.exprType).getType()));
         }
      }
      return res;
   }

   @Override public Boolean visitPowExpr(chubixParser.PowExprContext ctx) {
      Boolean res = visit(ctx.e1) && checkNumericType(ctx, ctx.e1.exprType) &&
                    visit(ctx.e2) && checkNumericType(ctx, ctx.e2.exprType) && (!ctx.e2.exprType.isDimensional());
      if (res)
         ctx.exprType = fetchType(ctx.e1.exprType, ctx.e2.exprType);
      return res;
   }

   @Override public Boolean visitConditionalExpr(chubixParser.ConditionalExprContext ctx) {
      Boolean res = visit(ctx.e1) && visit(ctx.e2);
      
      if (!ctx.e1.exprType.conformsTo(ctx.e1.exprType)) {
         ErrorHandling.printError(ctx, "Incomparable types: " + ctx.e1.exprType + " and " + ctx.e2.exprType);
         res = false;
      }
      
      if  (ctx.e1.exprType == stringType && ctx.e2.exprType == stringType && (ctx.op.getText().equals("==") || ctx.op.getText().equals("!="))){
         ErrorHandling.printError(ctx, "Incomparable types: " + ctx.e1.exprType + " and " + ctx.e2.exprType);
         return false;
      }

      if (res)
         ctx.exprType = booleanType;
       
      return res;     
   }

   @Override public Boolean visitIdExpr(chubixParser.IdExprContext ctx) {
      Boolean res = true;
      String id = ctx.ID().getText();
      if (!chubixParser.symbolTable.containsKey(id)) {
         ErrorHandling.printError(ctx, "Variable \""+id+"\" does not exists!");
         res = false;
      }
      else {
         Symbol sym = chubixParser.symbolTable.get(id);
         if (!sym.valueDefined()) {
            ErrorHandling.printError(ctx, "Variable \""+id+"\" not defined!");
            res = false;
         }
         // declaration
         else
            ctx.exprType = sym.type();
      }
      return res;
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
         map1.put(k, (int) Math.pow(map1.get(k), i));
      });

      dim1.setUnit(map1);
     
      ctx.unitdimType = dim1;

      return res;
   }
   
   // @Override public Boolean visitDimUnn(chubixParser.DimUnnContext ctx) {
   //    return visitChildren(ctx);
   // }
   



   @Override public Boolean visitDimMultDiv(chubixParser.DimMultDivContext ctx) {
      Boolean res =  visit(ctx.unitdim(0)) &&  visit(ctx.unitdim(1));
      if (!res)
         return false;
      DimensionsType dim1 = ctx.unitdim(0).unitdimType;
      DimensionsType dim2 = ctx.unitdim(1).unitdimType;
      HashMap<String,Integer> map1 = dim1.getUnit();
      HashMap<String,Integer> map2 = dim2.getUnit();

      switch(ctx.op.getText()){
         case "*":
            //Merge maps
            map1.forEach((k, v) -> map2.merge(k, v, (v1, v2) -> v1 + v2));
            map1.forEach((k, v) -> {
               map2.putIfAbsent(k, v);
            });
            map2.values().removeIf(f -> f == 0f);

            dim2.setUnit(map2);
            break;
         case "/":
             map1.forEach((k, v) -> map2.merge(k, v, (v1, v2) -> v1 - v2));
            map1.forEach((k, v) -> {
               map2.putIfAbsent(k, v);
            });
            map2.values().removeIf(f -> f == 0f);
            dim2.setUnit(map2);
            break;
      }
      ctx.unitdimType = dim2;

      return res;
   }

   @Override public Boolean visitDimID(chubixParser.DimIDContext ctx) {
      Boolean res = false;
      String unit = ctx.ID().getText();

      HashMap<String, Integer> unitmap = new HashMap<>();
      unitmap.put(unit, 1);
      
      // for (DimensionsType dimType : dimensionParser.dimTable) {//dimensionParser n tá na pasta
      //    if (dimType.containsUnit(unitmap)){
      //       ctx.unitdimType = dimType;
      //       res = true;
      //    }
      // }
      
      if (!res)
         ErrorHandling.printError(ctx, "There is no dimension with that unit!");
      return res;
   }

   private Boolean checkNumericType(chubixParser.ExprContext ctx, Type t) {
      Boolean res = true;
      if (!t.isNumeric()) {
         ErrorHandling.printError(ctx, "Numeric operator applied to a non-numeric operand!");
         res = false;
      }
      return res;
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
         if (dimType.containsUnit(map))
            return dimType;
     }
     return null;
   }
   
}