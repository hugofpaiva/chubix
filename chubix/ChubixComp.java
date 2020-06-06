import org.stringtemplate.v4.*;
import java.util.Iterator;

public class ChubixComp extends chubixBaseVisitor<ST> {
   private STGroup templates = new STGroupFile("chubix.stg");
   private int numVars = 0;

   private String newVar() {
      numVars++;
      return "v"+numVars;
   }

   @Override public ST visitMain(chubixParser.MainContext ctx) {
      return visit(ctx.instList());
   }

   @Override public ST visitInstList(chubixParser.InstListContext ctx) {
      ST res = templates.getInstanceOf("module");
      Iterator<chubixParser.InstructionContext> list = ctx.instruction().iterator();
      while (list.hasNext()) {
         res.add("inst", visit(list.next()).render());
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

   @Override public ST visitAssignVar(chubixParser.AssignVarContext ctx) {
      ST res = templates.getInstanceOf("declaration");

      res.add("var", ctx.ID().getText());
      res.add("inst",visit(ctx.expr()).render());
      res.add("value",ctx.expr().varName);     
      return res;
   }

   @Override public ST visitDefineVar(chubixParser.DefineVarContext ctx) {
      ST res = templates.getInstanceOf("declaration");

      res.add("type", ctx.declare().type().getText());
      
      res.add("var", ctx.declare().ID().getText());

      res.add("inst", visit(ctx.expr()).render());
      res.add("value", ctx.expr().varName);

      return res;
   }

   @Override public ST visitDeclare(chubixParser.DeclareContext ctx) {
      ST res = templates.getInstanceOf("declaration");

      res.add("type", ctx.type().getText());
      res.add("var", ctx.ID().getText());

      return res;
   }

   @Override public ST visitConditional(chubixParser.ConditionalContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitElseCond(chubixParser.ElseCondContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitForLoop(chubixParser.ForLoopContext ctx) {
      return visitChildren(ctx);
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

   @Override public ST visitDoubleExpr(chubixParser.DoubleExprContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      ctx.varName = newVar();
      res.add("type", "Double");
      res.add("var", ctx.varName);
      res.add("value",ctx.DOUBLE().getText());
      return res;
   }
   // mudar o tipo depois
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
      return visitChildren(ctx);
   }

   @Override public ST visitParenExpr(chubixParser.ParenExprContext ctx) {
      ST res = visit(ctx.expr());
      ctx.varName = ctx.expr().varName;
      return res;
   }

   @Override public ST visitFunctionExpr(chubixParser.FunctionExprContext ctx) {
      return visitChildren(ctx);
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
      return visitChildren(ctx);
   }

   @Override public ST visitSignExpr(chubixParser.SignExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitMultDivRestExpr(chubixParser.MultDivRestExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitPowExpr(chubixParser.PowExprContext ctx) {
      return visitChildren(ctx);
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
