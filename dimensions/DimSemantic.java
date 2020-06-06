import static java.lang.System.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;

public class DimSemantic extends dimensionsBaseVisitor<Symbol> {

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

   @Override public Symbol visitRelativeDim(dimensionsParser.RelativeDimContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Symbol visitPrimitiveDim(dimensionsParser.PrimitiveDimContext ctx) {
      String dim = ctx.ID(0).getText();
      String unit = ctx.ID(1).getText();
      Type type = ctx.type().res;
      
      if (dimensionsParser.dimTable.containsKey(dim))
      {
         ErrorHandling.printError(ctx, "Dimension \""+ dim +"\" already defined.\"");
         return new BooleanValue(false);
      }
      for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()) {
         if (dimensionsType.getUnits().containsKey(unit)) {
            ErrorHandling.printError(ctx, "Unit \""+unit+"\" already defined.\"");
            return new BooleanValue(false);
         }
      }
      
      dimensionsParser.dimTable.put(dim, new DimensionsType(dim, unit, type));  //add dim to map dimTable

      return new BooleanValue(true);
   }

   @Override public Symbol visitUnit(dimensionsParser.UnitContext ctx) {
      String dim = ctx.ID(0).getText();

      if (!dimensionsParser.dimTable.containsKey( dim ))
      {
         ErrorHandling.printError(ctx, "Dimension \""+ dim +"\" already defined.\"");
         // sys exit
         return new BooleanValue(false);
      }

      Type dimType = dim.getType();

      String unit = ctx.ID(1).getText();

      Symbol value = visit(ctx.expr()); // returns the value of the unit

      // m/s

      // 200m * 30s = 6000 m/S

      // val 200
      // type dimtype distancia

      // val 6000
      // type 

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

      // default m/s -> 1
      // unit
      // mack 200 * m/s
      // -> 200 * 1
      // -> 200
      
      
      
      for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()){
         if (dimensionsType.getUnits().containsKey(unit)) {
            ErrorHandling.printError(ctx, "Unit \""+unit+"\" already defined.\"");
            return new BooleanValue(false);
         }
      }

      // para o interpreter
      dimensionsParser.dimTable.get(dim).getUnits().put(unit, conversion_value);

      return visitChildren(ctx);
   }



   @Override public Symbol visitExprUnn(dimensionsParser.ExprUnnContext ctx) {
      if (ctc.op().getText().equals("-")) {
         Symbol sym = visitChildren(ctx);
         if (value.type().name().equals("double"))
            sym.value().setDoubleValue(-sym.value().doubleValue());
         else 
            sym.value().setIntegerValue(-sym.value().integerValue());  
         return sym;
      }
      return visitChildren(ctx);
   }

   @Override public Symbol visitExprDouble(dimensionsParser.ExprDoubleContext ctx) {
      return new Symbol(new DoubleType(), new DoubleValue(Double.parseDouble(ctx.DOUBLE().getText())));
   }

   @Override public Value visitExprSumMin(dimensionsParser.ExprSumMinContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Symbol visitExprInt(dimensionsParser.ExprIntContext ctx) {
      return new Symbol(new IntegerType(), new IntegerValue(Integer.parseInt(ctx.INTEGER().getText())));
   }

   @Override public Symbol visitExprMultDiv(dimensionsParser.ExprMultDivContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Symbol visitExprPower(dimensionsParser.ExprPowerContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Symbol visitExprID(dimensionsParser.ExprIDContext ctx) {
      String unit = ctx.ID().getText();
      
      // check if ID exists
      for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()){
         if (dimensionsType.getUnits().containsKey(unit)) {
            return new Symbol(dimensionsType, dimensionsType.getUnits().get(unit)).setDim(dimensionsType.name);
         }
      }
      ErrorHandling.printError(ctx, "Unit \""+unit+"\" not defined.\"");
      return null;
   }




   @Override public Symbol visitDimPower(dimensionsParser.DimPowerContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Symbol visitDimUnn(dimensionsParser.DimUnnContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Symbol visitDimMultDiv(dimensionsParser.DimMultDivContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Symbol visitDimID(dimensionsParser.DimIDContext ctx) {
      return visitChildren(ctx);
   }

}
