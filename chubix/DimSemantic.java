import static java.lang.System.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;

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
      String id = ctx.ID().getText();
      String unit = ctx.unitdim().getText();
      Type type = ctx.type().getText().res;
      
      if (dimensionsParser.dimTable.containsKey(id))
      {
         ErrorHandling.printError(ctx, "Dimension \""+id+"\" already defined.\"");
         // sys exit
         return false;
      }
      for (DimensionType dimType : dimensionsParser.dimTable.valuesalues()){
         if (dimType.containsKey(unit)) {
            ErrorHandling.printError(ctx, "Unit \""+unit+"\" already defined.\"");
            return false;
         }
      }

      DimParser.dimTable.put(id, new DimensionType(id, unit, type));  //add dim to map dimTable

      return true;
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

}
