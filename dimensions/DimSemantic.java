import static java.lang.System.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;

public class DimSemantic extends dimensionsBaseVisitor<Value> {
/*
   @Override public Value visitMain(dimensionsParser.MainContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Value visitStatList(dimensionsParser.StatListContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Value visitStat(dimensionsParser.StatContext ctx) {
      return visitChildren(ctx);
   }
*/

   @Override public Value visitRelativeDim(dimensionsParser.RelativeDimContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Value visitPrimitiveDim(dimensionsParser.PrimitiveDimContext ctx) {
      String id = ctx.ID(0).getText();
      String unit = ctx.ID(1).getText();
      Type type = ctx.type().res;
      
      if (dimensionsParser.dimTable.containsKey(id))
      {
         ErrorHandling.printError(ctx, "Dimension \""+id+"\" already defined.\"");
         return new BooleanValue(false);
      }
      for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()) {
         if (dimensionsType.getUnits().containsKey(unit)) {
            ErrorHandling.printError(ctx, "Unit \""+unit+"\" already defined.\"");
            return new BooleanValue(false);
         }
      }
      
      dimensionsParser.dimTable.put(id, new DimensionsType(id, unit, type));  //add dim to map dimTable

      return new BooleanValue(true);
   }

   @Override public Value visitUnit(dimensionsParser.UnitContext ctx) {
      String id = ctx.ID(0).getText();
      String unit = ctx.ID(1).getText();
      Value value = visit(ctx.expr()); // returns the value of the unit
      
      double conversion_value;
      if (value.type().name().equals("double"))
         conversion_value = value.doubleValue();
      else 
         conversion_value = value.intValue();
  
      // default m
      //    unit velo(km : 1000*dm)
         
      //    -> dm : 4

      //    -> 4*1000

      //    -> 4000m
      
      if (!dimensionsParser.dimTable.containsKey(id))
      {
         ErrorHandling.printError(ctx, "Dimension \""+id+"\" already defined.\"");
         // sys exit
         return new BooleanValue(false);
      }
      
      for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()){
         if (dimensionsType.getUnits().containsKey(unit)) {
            ErrorHandling.printError(ctx, "Unit \""+unit+"\" already defined.\"");
            return new BooleanValue(false);
         }
      }

      // para o interpreter
      dimensionsParser.dimTable.get(id).getUnits().put(unit, conversion_value);

      return visitChildren(ctx);
   }

   @Override public Value visitExprUnn(dimensionsParser.ExprUnnContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Value visitExprDouble(dimensionsParser.ExprDoubleContext ctx) {
      return new DoubleValue(Double.parseDouble(ctx.DOUBLE().getText()));
   }

   @Override public Value visitExprSumMin(dimensionsParser.ExprSumMinContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Value visitExprInt(dimensionsParser.ExprIntContext ctx) {
      return new IntegerValue(Integer.parseInt(ctx.INTEGER().getText()));
   }

   @Override public Value visitExprMultDiv(dimensionsParser.ExprMultDivContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Value visitExprPower(dimensionsParser.ExprPowerContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Value visitExprID(dimensionsParser.ExprIDContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Value visitDimPower(dimensionsParser.DimPowerContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Value visitDimUnn(dimensionsParser.DimUnnContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Value visitDimMultDiv(dimensionsParser.DimMultDivContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Value visitDimID(dimensionsParser.DimIDContext ctx) {
      return visitChildren(ctx);
   }

}
