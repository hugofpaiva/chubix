import org.stringtemplate.v4.*;
import java.util.Iterator;

public class Compiler extends chubixBaseVisitor<ST> {
   private STGroup templates = new STGroupFile("chubix.stg");
   private int numVars = 0;

   private String newVar() {
      numVars++;
      return "v"+numVars;
   }

   @Override public ST visitMain(chubixParser.MainContext ctx) {
      return visitChildren(ctx);
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
      return visitChildren(ctx);
   }

   @Override public ST visitInput(chubixParser.InputContext ctx) {
      return visitChildren(ctx);
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
      res.add("type", ctx.ID().getText());
      res.add("inst", visit(ctx.expr()).render());
      res.add("value", ctx.expr().varName);
      return res;
   }

   @Override public ST visitDefineVar(chubixParser.DefineVarContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      res.add("type", visit(ctx.declare).type.getText());
      res.add("var", visit(ctx.declare).ID.getText());
      if(ctx.valueex != null){
         res.add("value", visit(ctx.valueex));
      }else if(ctx.valuest != null){
         res.add("value",ctx.valuest.getText());
      } else if(ctx.valuein != null){
         res.add("value",visit(ctx.valuein));
      }
      return res;
   }

   @Override public ST visitDeclare(chubixParser.DeclareContext ctx) {
      ST res = templates.getInstanceOf("declaration");
      res.add("type", ctx.type.getText());
      res.add("var", ctx.ID.getText());
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
      return visitChildren(ctx);
   }

   @Override public ST visitDoubleSumMin(chubixParser.DoubleSumMinContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitAddSubExpr(chubixParser.AddSubExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitIntegerExpr(chubixParser.IntegerExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitSignExpr(chubixParser.SignExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitBooleanExpr(chubixParser.BooleanExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitMultDivRestExpr(chubixParser.MultDivRestExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitPowExpr(chubixParser.PowExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitParenExpr(chubixParser.ParenExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitConditionalExpr(chubixParser.ConditionalExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitIdExpr(chubixParser.IdExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitFunctionExpr(chubixParser.FunctionExprContext ctx) {
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
