import org.stringtemplate.v4.*;
import java.util.Iterator;
import java.util.HashMap;


public class ChubixComp extends chubixBaseVisitor<ST> {
   private STGroup templates = new STGroupFile("chubix.stg");
   private int numVars = 0;

   private String newVar() {
      numVars++;
      return "v"+numVars;
   }
   
   @Override public ST visitMain(chubixParser.MainContext ctx) {
      chubixParser.current = chubixParser.global;
      ST res = templates.getInstanceOf("module");
      
      Iterator<chubixParser.FunctionContext> listfunc = ctx.function().iterator();
      while (listfunc.hasNext()) {
         res.add("func", visit(listfunc.next()).render());
      }
      res.add("inst", visit(ctx.instList()).render());
      
      return res;
   }

   @Override public ST visitInstList(chubixParser.InstListContext ctx) {
      if(chubixParser.current.parent()==null)
         chubixParser.current = chubixParser.current.down(); 
      
      ST res = templates.getInstanceOf("insts");
      Iterator<chubixParser.InstructionContext> listinst = ctx.instruction().iterator();
      while (listinst.hasNext()) {
         res.add("inst", visit(listinst.next()).render());
      }

      return res;
   }

   @Override public ST visitInstruction(chubixParser.InstructionContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitPrint(chubixParser.PrintContext ctx) {
      ST res = templates.getInstanceOf("print");
      if(ctx.expr()!=null){
         res.add("inst",visit(ctx.expr()).render());
         if (ctx.expr().exprType.isDimensional()){
            res.add("value",ctx.expr().varName+"+\" [" + DimensionsType.mapToString(((DimensionsType)ctx.expr().exprType).getUnit())+"]\"");
            
         }
         else
            res.add("value",ctx.expr().varName);
      }
      return res;
   }

   @Override public ST visitReturnFunc(chubixParser.ReturnFuncContext ctx) {
      ST res = templates.getInstanceOf("funcReturn");
      if(ctx.expr()!=null){
         res.add("inst", visit(ctx.expr()).render());
         res.add("var", ctx.expr().varName);
      }
      return res;
   }

   @Override public ST visitFunction(chubixParser.FunctionContext ctx) {
      chubixParser.current = chubixParser.current.down();
      String nvar = newVar();
      chubixParser.global.symbols().get(ctx.func_name.getText()).setVarName(nvar);

      ST res = templates.getInstanceOf("function");
      visit(ctx.ret_type);
      res.add("type", ((FunctionType)chubixParser.global.symbols().get(ctx.func_name.getText()).type()).getType().getJavaType());
      res.add("name", nvar);

      for(int i=0;i<ctx.declare().size();i++){
         String arg = visit(ctx.declare(i)).render();
         res.add("args", arg.substring(0, arg.length() - 1));
      }
      res.add("inst",visit(ctx.instList()).render());
      res.add("inst",visit(ctx.returnFunc()).render());
      chubixParser.current = chubixParser.current.parent();
      return res;
   }

   @Override public ST visitCallFunction(chubixParser.CallFunctionContext ctx) {
      ctx.varName = newVar();
      ST res = templates.getInstanceOf("callFunction");
      res.add("name", chubixParser.global.symbols().get(ctx.func_name.getText()).varName());
      
      
      if(!((FunctionType)chubixParser.global.symbols().get(ctx.func_name.getText()).type()).getType().getJavaType().equals("void")){
         ST temp = templates.getInstanceOf("declaration");
         for(int i=0;i<ctx.expr().size();i++){
            temp.add("inst", visit(ctx.expr(i)).render());
            res.add("args", ctx.expr(i).varName);
         }
         temp.add("type",((FunctionType)chubixParser.global.symbols().get(ctx.func_name.getText()).type()).getType().getJavaType());
         temp.add("var",ctx.varName);
         temp.add("value",res.render());  
         return temp;
      }else{
         for(int i=0;i<ctx.expr().size();i++){
            res.add("inst", visit(ctx.expr(i)).render());
            res.add("args", ctx.expr(i).varName);
         }
      }
      return res;
   }
  
   @Override public ST visitAssignment(chubixParser.AssignmentContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      String varName = chubixParser.current.lookup(ctx.ID().getText()).varName();
      res.add("var", varName);
      res.add("inst",visit(ctx.expr()).render());
      res.add("value", ctx.expr().varName);     
      return res;
   }
   
  
   @Override public ST visitDeclAssig(chubixParser.DeclAssigContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      String varName = newVar();
      visit(ctx.declare());
      chubixParser.current.lookup(ctx.declare().ID().getText()).setVarName(varName);
      if (!ctx.declare().type().res.isDimensional())
         res.add("type", ctx.declare().type().res.name());
      else 
         res.add("type", ((DimensionsType) ctx.declare().type().res).getType().name());
      res.add("var", varName);
      res.add("inst", visit(ctx.expr()).render());
      res.add("value", ctx.expr().varName);

      return res;
   }


   @Override public ST visitDeclare(chubixParser.DeclareContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      visit(ctx.type());
      String varName = newVar();
      chubixParser.current.lookup(ctx.ID().getText()).setVarName(varName);
      if (!ctx.type().res.isDimensional())
         res.add("type", ctx.type().res.name());
      else
         res.add("type", ((DimensionsType) ctx.type().res).getType().name());
      res.add("var", varName);

      return res;
   }

   @Override public ST visitConditional(chubixParser.ConditionalContext ctx) {
      chubixParser.current = chubixParser.current.down();     
      ST res = templates.getInstanceOf("cond");
      res.add("instif", visit(ctx.expr()).render());
      res.add("var",ctx.expr().varName);
      res.add("trueInst",visit(ctx.trueSL).render());  
      chubixParser.current = chubixParser.current.parent();    
      if(ctx.falseSL != null){
         res.add("falseInst",visit(ctx.falseSL).render());  
      }
      return res;
   }

   @Override public ST visitConditionalElse(chubixParser.ConditionalElseContext ctx) {
      return visit(ctx.conditional());
   }

   @Override public ST visitInstElse(chubixParser.InstElseContext ctx) {
      chubixParser.current = chubixParser.current.down();     
      ST res = visit(ctx.instList());
      chubixParser.current = chubixParser.current.parent();   
      return res;
   }

   @Override public ST visitForLoop(chubixParser.ForLoopContext ctx) {
      chubixParser.current = chubixParser.current.down(); 
      ST res = templates.getInstanceOf("whileLoop");
      if(ctx.var!=null)
         res.add("instfor", visit(ctx.var).render());
      else
         res.add("instfor",visit(ctx.declAssig()));
      res.add("instbefore",visit(ctx.expr()).render());
      res.add("var",ctx.varBreak.varName);
      res.add("instafter",visit(ctx.instList()).render());
      res.add("instafter", visit(ctx.varInc).render());
      chubixParser.current = chubixParser.current.parent(); 
      return res;
   }

   @Override public ST visitWhileLoop(chubixParser.WhileLoopContext ctx) {
      chubixParser.current = chubixParser.current.down();  
      ST res = templates.getInstanceOf("whileLoop");

      res.add("instbefore",visit(ctx.expr()).render());
      res.add("var", ctx.expr().varName);
      res.add("instafter",visit(ctx.instList()).render());
      chubixParser.current = chubixParser.current.parent();  
      return res;  
   }

   @Override public ST visitBreakLoop(chubixParser.BreakLoopContext ctx) {
      ST res = templates.getInstanceOf("insert");
      res.add("var", "break");
      return res;
   }

   @Override public ST visitContinueLoop(chubixParser.ContinueLoopContext ctx) {
      ST res = templates.getInstanceOf("insert");
      res.add("var", "continue");
      return res;
   }

   @Override public ST visitIntType(chubixParser.IntTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDoubleType(chubixParser.DoubleTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitBoolType(chubixParser.BoolTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitStrType(chubixParser.StrTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDimensionType(chubixParser.DimensionTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDoubleExpr(chubixParser.DoubleExprContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      ctx.varName = newVar();
      res.add("type", "Double");
      res.add("var", ctx.varName);
      res.add("value",ctx.DOUBLE().getText());
      return res;
   }

   @Override public ST visitAddSubExpr(chubixParser.AddSubExprContext ctx) {
      ST res = templates.getInstanceOf("binaryOperation");
      ctx.varName = newVar();

      res.add("inst", visit(ctx.e1).render());
      res.add("inst", visit(ctx.e2).render());
      res.add("type", ctx.exprType.getJavaType());
      res.add("var", ctx.varName);
      res.add("e1", ctx.e1.varName);
      res.add("op", ctx.op.getText());
      res.add("e2", ctx.e2.varName);
      return res;
   }

   @Override public ST visitIntegerExpr(chubixParser.IntegerExprContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      ctx.varName = newVar();
      res.add("type", "Integer");
      res.add("var", ctx.varName);
      res.add("value",ctx.INTEGER().getText());
      return res;
   }

   @Override public ST visitBooleanExpr(chubixParser.BooleanExprContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      ctx.varName = newVar();
      res.add("type", "Boolean");
      res.add("var", ctx.varName);
      res.add("value",ctx.BOOLEAN().getText());
      return res;
   }

   @Override public ST visitInputExpr(chubixParser.InputExprContext ctx) {
      ctx.varName = newVar();
      ST res = templates.getInstanceOf("input");
      visit(ctx.type());

      if (ctx.STRING() != null)
        res.add("value", ctx.STRING().getText());

      if (!ctx.type().res.isDimensional())
         res.add("type", ctx.type().res.name());
      else    
         res.add("type", ((DimensionsType) ctx.type().res).getType().name());

      res.add("typescan", ctx.type().res.getJavaType());
      res.add("var", ctx.varName);
      return res;
   }

   @Override public ST visitParenExpr(chubixParser.ParenExprContext ctx) {
      ST res = visit(ctx.expr());
      ctx.varName = ctx.expr().varName;
      return res;
   }

   @Override public ST visitFunctionExpr(chubixParser.FunctionExprContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      res.add("inst",visit(ctx.callFunction()).render());
      ctx.varName = newVar();
      res.add("type",((FunctionType)chubixParser.global.symbols().get(ctx.callFunction().func_name.getText()).type()).getType().getJavaType());
      res.add("var",ctx.varName);
      res.add("value",ctx.callFunction().varName);
      return res;
   }

   @Override public ST visitStringExpr(chubixParser.StringExprContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      ctx.varName = newVar();
      res.add("type", "String");
      res.add("var", ctx.varName);
      res.add("value",ctx.STRING().getText());
      return res;
   }

   @Override public ST visitDoubleSumMin(chubixParser.DoubleSumMinContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      ctx.varName = newVar();
      res.add("type",ctx.exprType.getJavaType());
      res.add("var",ctx.varName);
      String id = chubixParser.current.lookup(ctx.ID().getText()).varName();
      res.add("value",id+ctx.op.getText());
   
      return res;
   }

   @Override public ST visitSignExpr(chubixParser.SignExprContext ctx) {
      ST res = templates.getInstanceOf("binaryOperation");
      ctx.varName = newVar();
      res.add("inst", visit(ctx.expr()).render());
      res.add("type", ctx.expr().exprType.getJavaType());
      res.add("var", ctx.varName);
      res.add("e1", 0);
      res.add("op", ctx.sign.getText());
      res.add("e2", ctx.expr().varName);
      return res;
   }

   @Override public ST visitMultDivRestExpr(chubixParser.MultDivRestExprContext ctx) {
      ST res = templates.getInstanceOf("binaryOperation");
      ctx.varName = newVar();

      res.add("inst", visit(ctx.e1).render());
      res.add("inst", visit(ctx.e2).render());
     
      res.add("type", ctx.exprType.getJavaType());
      res.add("var", ctx.varName);
      res.add("e1", ctx.e1.varName);
      res.add("op", ctx.op.getText());
      res.add("e2", ctx.e2.varName);
      return res;
   }

   @Override public ST visitPowExpr(chubixParser.PowExprContext ctx) {
      ST res = templates.getInstanceOf("powerExpr");
      ctx.varName = newVar();
      res.add("inst",visit(ctx.e1).render());
      res.add("inst",visit(ctx.e2).render());
      res.add("type","Double");
      res.add("var",ctx.varName);
      res.add("e1",ctx.e1.varName);
      res.add("e2",ctx.e2.varName);
      return res;
   }

   @Override public ST visitConditionalExpr(chubixParser.ConditionalExprContext ctx) {
      ST res = templates.getInstanceOf("binaryOperation");
      ctx.varName = newVar();
      res.add("inst", visit(ctx.e1).render());
      res.add("inst", visit(ctx.e2).render());
      res.add("type", "Boolean");
      res.add("var", ctx.varName);
      
      if (ctx.op.getText().equals("==") || ctx.op.getText().equals("!=")){
         if(ctx.e1.exprType.name().equals("string") && ctx.e2.exprType.name().equals("string")){
            if(ctx.op.getText().equals("!="))
               res.add("e1", "!"+ctx.e1.varName);
            else
               res.add("e1", ctx.e1.varName);
            res.add("op", ".equals(");
            res.add("e2", ctx.e2.varName+")");
         }else {
            res.add("e1", ctx.e1.varName);
            res.add("op", ctx.op.getText());
            res.add("e2", ctx.e2.varName);
         }
       }else {
         res.add("e1", ctx.e1.varName);
         res.add("op", ctx.op.getText());
         res.add("e2", ctx.e2.varName);
       }
      
      return res;
   }

   @Override public ST visitIdExpr(chubixParser.IdExprContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      ctx.varName = newVar();
      res.add("var", ctx.varName);
      res.add("value", chubixParser.current.lookup(ctx.ID().getText()).varName());
      res.add("type", ctx.exprType.getJavaType());
      return res;
   }

   
   @Override public ST visitExprConvUnit(chubixParser.ExprConvUnitContext ctx) { 
      ST res =templates.getInstanceOf("binaryOperation");
      ctx.varName = newVar();
      String temp = newVar();
      double value = 1.0; 
      ST a = visit(ctx.expr());
      HashMap<String,Integer> unit = ctx.unitdim().unitdimType.getUnit();  
      if (!ctx.expr().exprType.isDimensional())
         for (DimensionsType dimensionsType : dimensionsParser.dimTable.values())
            if (dimensionsType.containsUnit(unit)) {  
               value = ctx.unitdim().unitdimType.getUnitConv(unit);
               break;
            }
      res.add("inst",a.render());
      res.add("var", temp);
      res.add("type", "Double");
      res.add("e1",ctx.expr().varName);
      res.add("op","/");  
      res.add("e2", ""+value);
      
      ST dec = templates.getInstanceOf("declaration");
      String t = ctx.unitdim().unitdimType.getJavaType();
      dec.add("type",t);
      dec.add("var",ctx.varName);
      dec.add("value","("+t+")"+temp);
      dec.add("inst",res.render());
      return dec;  
   }                    
   
   @Override public ST visitDimPower(chubixParser.DimPowerContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDimUnn(chubixParser.DimUnnContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDimMultDiv(chubixParser.DimMultDivContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDimID(chubixParser.DimIDContext ctx) {
      return visitChildren(ctx);
   }
}
