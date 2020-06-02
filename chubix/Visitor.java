import java.util.Map;
import java.util.HashMap;

public class Visitor extends dimensionsBaseVisitor<Boolean> {

   @Override public Boolean visitMain(dimensionsParser.MainContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitStatList(dimensionsParser.StatListContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitStat(dimensionsParser.StatContext ctx) {
      return visitChildren(ctx);
   }

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

   @Override public Boolean visitDimMultDiv(dimensionsParser.DimMultDivContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitDimID(dimensionsParser.DimIDContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitType(dimensionsParser.TypeContext ctx) {
      return visitChildren(ctx);
   }
}
