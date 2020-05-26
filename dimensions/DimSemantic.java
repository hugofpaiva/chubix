import static java.lang.System.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class DimSemantic extends dimensionsBaseVisitor<Boolean> {
/*
   @Override public Boolean visitMain(dimensionsParser.MainContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitStatList(dimensionsParser.StatListContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitStat(dimensionsParser.StatContext ctx) {
      return visitChildren(ctx);
   }
*/

   @Override public Boolean visitRelativeDim(dimensionsParser.RelativeDimContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitPrimitiveDim(dimensionsParser.PrimitiveDimContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitUnit(dimensionsParser.UnitContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitExprUnn(dimensionsParser.ExprUnnContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitExprDouble(dimensionsParser.ExprDoubleContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitExprSumMin(dimensionsParser.ExprSumMinContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitExprInt(dimensionsParser.ExprIntContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitExprMultDiv(dimensionsParser.ExprMultDivContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitExprPower(dimensionsParser.ExprPowerContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitExprID(dimensionsParser.ExprIDContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDimPower(dimensionsParser.DimPowerContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDimUnn(dimensionsParser.DimUnnContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDimSumMin(dimensionsParser.DimSumMinContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDimMultDiv(dimensionsParser.DimMultDivContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDimID(dimensionsParser.DimIDContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitIntType(dimensionsParser.IntTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDoubleType(dimensionsParser.DoubleTypeContext ctx) {
      return visitChildren(ctx);
   }
}
