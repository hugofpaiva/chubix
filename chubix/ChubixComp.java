import org.stringtemplate.v4.*;
import java.util.Iterator;


public class ChubixComp extends chubixBaseVisitor<ST> {
   private STGroup templates = new STGroupFile("chubix.stg");
   private int numVars = 0;

   private String newVar() {
      numVars++;
      return "v"+numVars;
   }
   
   //FEITO
   @Override public ST visitMain(chubixParser.MainContext ctx) {
      ST res = templates.getInstanceOf("module");
      res.add("inst", visit(ctx.instList()).render());   
      return res;
   }

   //FEITO
   @Override public ST visitInstList(chubixParser.InstListContext ctx) {
      ST res = templates.getInstanceOf("insts");
      Iterator<chubixParser.InstructionContext> list = ctx.instruction().iterator();
      while (list.hasNext()) {
         res.add("inst", visit(list.next()).render());
      }
      return res;
   }

   @Override public ST visitInstruction(chubixParser.InstructionContext ctx) {
      return visitChildren(ctx);
   }
   //Tratar tipos
   @Override public ST visitPrint(chubixParser.PrintContext ctx) {
      ST res = templates.getInstanceOf("print");
      if(ctx.expr()!=null){
         res.add("inst",visit(ctx.expr()).render());
         res.add("value",ctx.expr().varName);
      }
      return res;
   }

   @Override public ST visitReturnFunc(chubixParser.ReturnFuncContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitFunction(chubixParser.FunctionContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitCallFunction(chubixParser.CallFunctionContext ctx) {
      return visitChildren(ctx);
   }

   //FEITO
   @Override public ST visitAssignVar(chubixParser.AssignVarContext ctx) {
      ST res = templates.getInstanceOf("declaration");

      res.add("var", ctx.ID().getText());
      res.add("inst",visit(ctx.expr()).render());
      res.add("value",ctx.expr().varName);     
      return res;
   }
   //Tratar tipos
   @Override public ST visitDefineVar(chubixParser.DefineVarContext ctx) {
      ST res = templates.getInstanceOf("declaration");

      res.add("type", ctx.declare().type().getText());
      
      res.add("var", ctx.declare().ID().getText());
      
      res.add("inst", visit(ctx.expr()).render());
      res.add("value", ctx.expr().varName);

      return res;
   }

   //TRATAR TIPOS
   @Override public ST visitDeclare(chubixParser.DeclareContext ctx) {
      ST res = templates.getInstanceOf("declaration");

      res.add("type", ctx.type().getText());
      res.add("var", ctx.ID().getText());

      return res;
   }

   @Override public ST visitConditional(chubixParser.ConditionalContext ctx) {
      ST res = templates.getInstanceOf("cond");

      res.add("expr", ctx.expr().getText());
      res.add("inst", visit(ctx.trueSL).render());  
      
      return res;
   }

   @Override public ST visitConditionalElse(chubixParser.ConditionalElseContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitInstElse(chubixParser.InstElseContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitForLoop(chubixParser.ForLoopContext ctx) {
      ST res = templates.getInstanceOf("forLoop");
      res.add("inst",visit(ctx.var).render());
      res.add("assign1", );
      res.add("expr",ctx.expr().getText());
      res.add("assign2",visit(ctx.assignment(1)).render());
      res.add("inside",visit(ctx.instList()).render());
      return res;
   }

   @Override public ST visitWhileLoop(chubixParser.WhileLoopContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitBreakLoop(chubixParser.BreakLoopContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitContinueLoop(chubixParser.ContinueLoopContext ctx) {
      return visitChildren(ctx);
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
   //FEITO
   @Override public ST visitDoubleExpr(chubixParser.DoubleExprContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      ctx.varName = newVar();
      res.add("type", "Double");
      res.add("var", ctx.varName);
      res.add("value",ctx.DOUBLE().getText());
      return res;
   }

   //TRATAR TIPOS
   @Override public ST visitAddSubExpr(chubixParser.AddSubExprContext ctx) {
      ST res = templates.getInstanceOf("binaryOperation");
      ctx.varName = newVar();

      res.add("inst", visit(ctx.e1).render());
      res.add("inst", visit(ctx.e2).render());
      res.add("type", "Double");
      res.add("var", ctx.varName);
      res.add("e1", ctx.e1.varName);
      res.add("op", ctx.op.getText());
      res.add("e2", ctx.e2.varName);
      return res;
   }
   //FEITO
   @Override public ST visitIntegerExpr(chubixParser.IntegerExprContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      ctx.varName = newVar();
      res.add("type", "Integer");
      res.add("var", ctx.varName);
      res.add("value",ctx.INTEGER().getText());
      return res;
   }
   //FEITO
   @Override public ST visitBooleanExpr(chubixParser.BooleanExprContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      ctx.varName = newVar();
      res.add("type", "Boolean");
      res.add("var", ctx.varName);
      res.add("value",ctx.BOOLEAN().getText());
      return res;
   }
   //TRATAR TIPOS
   @Override public ST visitInputExpr(chubixParser.InputExprContext ctx) {
      ctx.varName = newVar();
      ST res = templates.getInstanceOf("input");
      res.add("value",ctx.STRING().getText());
      res.add("type", "String");
      res.add("var", ctx.varName);
      return res;
   }
   //FEITO
   @Override public ST visitParenExpr(chubixParser.ParenExprContext ctx) {
      ST res = visit(ctx.expr());
      ctx.varName = ctx.expr().varName;
      return res;
   }

   @Override public ST visitFunctionExpr(chubixParser.FunctionExprContext ctx) {
      return visitChildren(ctx);
   }
   //FEITO
   @Override public ST visitStringExpr(chubixParser.StringExprContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      ctx.varName = newVar();
      res.add("type", "String");
      res.add("var", ctx.varName);
      res.add("value",ctx.STRING().getText());
      return res;
   }
   //Tratar tipos
   @Override public ST visitDoubleSumMin(chubixParser.DoubleSumMinContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      ctx.varName = newVar();
      res.add("type","Double");
      res.add("var",ctx.varName);
      res.add("value",ctx.ID().getText()+ctx.op.getText());
   
      return res;
   }

   //TRATAR TIPOS
   @Override public ST visitSignExpr(chubixParser.SignExprContext ctx) {
      ST res = templates.getInstanceOf("binaryOperation");
      ctx.varName = newVar();
      res.add("inst", visit(ctx.expr()).render());
      res.add("type", "Double");
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
      res.add("type", "Double");
      res.add("var", ctx.varName);
      res.add("e1", ctx.e1.varName);
      res.add("op", ctx.op.getText());
      res.add("e2", ctx.e2.varName);
      return res;
   }

   //TRATAR TIPOS
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
      return visitChildren(ctx);
   }

   @Override public ST visitIdExpr(chubixParser.IdExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDimPower(chubixParser.DimPowerContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDimUnn(chubixParser.DimUnnContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDimSumMin(chubixParser.DimSumMinContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDimMultDiv(chubixParser.DimMultDivContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDimID(chubixParser.DimIDContext ctx) {
      return visitChildren(ctx);
   }
}
