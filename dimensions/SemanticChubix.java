
import java.util.HashMap;

public class SemanticChubix extends chubixBaseVisitor<Boolean> {
   private final DoubleType doubleType = new DoubleType();
   private final IntegerType integerType = new IntegerType();
   private final BooleanType booleanType = new BooleanType();
   private final StringType stringType = new StringType();
   private final DimensionsType dimensionType = new DimensionType("", "", new DoubleValue(1));


   @Override public Boolean visitMain(chubixParser.MainContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitInstList(chubixParser.InstListContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitInstruction(chubixParser.InstructionContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitPrint(chubixParser.PrintContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitReturnFunc(chubixParser.ReturnFuncContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitFunction(chubixParser.FunctionContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitCallFunction(chubixParser.CallFunctionContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitAssignVar(chubixParser.AssignVarContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDefineVar(chubixParser.DefineVarContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDeclare(chubixParser.DeclareContext ctx) {
      Boolean res = true;
      //visit(ctx.type());
      String id = ctx.ID().getText();

      if (CalcParser.symbolTable.containsKey(id)) {
         ErrorHandling.printError(ctx, "Variable \""+id+"\" already declared!");
         res = false;
      } else
            CalcParser.symbolTable.put(id, new VariableSymbol(id, ctx.type().res));
      return res;
   }

   @Override public Boolean visitConditional(chubixParser.ConditionalContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitConditionalElse(chubixParser.ConditionalElseContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitInstElse(chubixParser.InstElseContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitForLoop(chubixParser.ForLoopContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitWhileLoop(chubixParser.WhileLoopContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitBreakLoop(chubixParser.BreakLoopContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitContinueLoop(chubixParser.ContinueLoopContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitIntType(chubixParser.IntTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDoubleType(chubixParser.DoubleTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitBoolType(chubixParser.BoolTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitStrType(chubixParser.StrTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDimensionType(chubixParser.DimensionTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDoubleExpr(chubixParser.DoubleExprContext ctx) {
      ctx.exprType = realType;
      if (ctx.unitdim() != null)
         return checkUnit(ctx.unitdim().getText());
      return true;
   }

   @Override public Boolean visitAddSubExpr(chubixParser.AddSubExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitIntegerExpr(chubixParser.IntegerExprContext ctx) {
      ctx.exprType = integerType;
      if (ctx.unitdim() != null) {
         // associar o dimension type ao ctx
         return checkUnit(ctx.unitdim().getText());
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
         return checkUnit(ctx.unitdim().getText());
      }
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
      return visitChildren(ctx);
   }

   @Override public Boolean visitDoubleSumMin(chubixParser.DoubleSumMinContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitSignExpr(chubixParser.SignExprContext ctx) {
      Boolean res = visit(ctx.expr()) && checkNumericType(ctx, ctx.expr().exprType);
      if (res) 
         ctx.exprType = ctx.expr().exprType;
      return res;
   }

   @Override public Boolean visitMultDivRestExpr(chubixParser.MultDivRestExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitPowExpr(chubixParser.PowExprContext ctx) {
      Boolean res = visit(ctx.e1) && checkNumericType(ctx, ctx.e1.exprType) &&
                    visit(ctx.e2) && checkNumericType(ctx, ctx.e2.exprType);
      if (res)
         ctx.exprType = fetchType(ctx.e1.exprType, ctx.e2.exprType);
      return res;
   }

   @Override public Boolean visitConditionalExpr(chubixParser.ConditionalExprContext ctx) {
      return visitChildren(ctx);
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
      return visitChildren(ctx);
   }

   @Override public Boolean visitDimUnn(chubixParser.DimUnnContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDimSumMin(chubixParser.DimSumMinContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDimMultDiv(chubixParser.DimMultDivContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDimID(chubixParser.DimIDContext ctx) {
      return visitChildren(ctx);
   }

   private Boolean checkNumericType(ParserRuleContext ctx, Type t) {
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
         if ("real".equals(t1.name()))
            res = t1;
         else if ("real".equals(t2.name()))
            res = t2;
         else
            res = t1;
      }
      else if ("boolean".equals(t1.name()) && "boolean".equals(t2.name()))
         res = t1;
      return res;
   }

   private Boolean checkUnit(String unit){
      return true;
   }
}
