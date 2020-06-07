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
      String dim = ctx.ID(0).getText();
      Type type = ctx.type().res;

      if (dimensionsParser.dimTable.containsKey(dim))
      {
         ErrorHandling.printError(ctx, "Dimension \""+ dim +"\" already defined.");
         return null;
      }

      if (ctx.ID(1)!=null){
         String unit = ctx.ID(1).getText();

         for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()) {
            if (dimensionsType.getUnits().containsKey(unit)) {
               ErrorHandling.printError(ctx, "Unit \""+unit+"\" already defined.");
               return null;
            }
         }
         

         
         dimensionsParser.dimTable.put(dim, new DimensionsType(dim, unit, type));  //add dim to map dimTable
      } else{


      }
      
      dimensionsParser.dimTable.put(dim, new DimensionsType(dim, unit, type));  //add dim to map dimTable

      return null;
   }

   @Override public Symbol visitPrimitiveDim(dimensionsParser.PrimitiveDimContext ctx) {
      String dim = ctx.ID(0).getText();
      String unit = ctx.ID(1).getText();
      Type type = ctx.type().res;
      
      if (dimensionsParser.dimTable.containsKey(dim))
      {
         ErrorHandling.printError(ctx, "Dimension \""+ dim +"\" already defined.");
         return null;
      }
      for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()) {
         if (dimensionsType.getUnits().containsKey(unit)) {
            ErrorHandling.printError(ctx, "Unit \""+unit+"\" already defined.");
            return null;
         }
      }     
      dimensionsParser.dimTable.put(dim, new DimensionsType(dim, unit, type));  //add dim to map dimTable

      return null;
   }

   @Override public Symbol visitUnit(dimensionsParser.UnitContext ctx) {
      String dim = ctx.ID(0).getText();

      if (!dimensionsParser.dimTable.containsKey( dim ))
      {
         ErrorHandling.printError(ctx, "Dimension \""+ dim +"\" already defined.");
         // sys exit
         return null;
      }

      Type dimType = dimensionsParser.dimTable.get(dim);

      String unit = ctx.ID(1).getText();

      Symbol sym = visit(ctx.expr()); // returns the value of the unit

      Double convert_value = sym.value().doubleValue();

      
      for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()){
         if (dimensionsType.getUnits().containsKey(unit)) {
            ErrorHandling.printError(ctx, "Unit \""+unit+"\" already defined.");
            return null;
         }
      }

      dimensionsParser.dimTable.get(dim).getUnits().put(unit, convert_value);

      return visitChildren(ctx);
   }


   @Override public Symbol visitExprSign(dimensionsParser.ExprSignContext ctx) {
      if (ctx.sign.getText().equals("-")) {
         Symbol sym = visitChildren(ctx);
         sym.value().setDoubleValue(-sym.value().doubleValue());
         return sym;
      }
      return visitChildren(ctx);
   }

   // @Override public Symbol visitExprUnn(dimensionsParser.ExprUnnContext ctx) {
   //    return visitChildren(ctx);
   // }

   @Override public Symbol visitExprDouble(dimensionsParser.ExprDoubleContext ctx) {
      return new Symbol(new DoubleType(), new DoubleValue(Double.parseDouble(ctx.DOUBLE().getText())));
   }

   @Override public Symbol visitExprSumMin(dimensionsParser.ExprSumMinContext ctx) {
      String op = ctx.op.getText();

      Symbol v1 = visit(ctx.expr(0)); 
      Symbol v2 = visit(ctx.expr(1));

      // semantic check
      if (!v1.type().conformsTo(v2.type())) {
         ErrorHandling.printError(ctx, "Units are not compatible.");
         return null;
      }

      Type resType = new DoubleType(); 
      if (!v1.dim().equals(""))
         resType = v1.type();

      switch (op) {
         case "+":
            return new Symbol(resType, v1.value().setDoubleValue(v1.value().doubleValue() + v2.value().doubleValue());
         case "-":
            return new Symbol(resType, v1.value().setDoubleValue(v1.value().doubleValue() - v2.value().doubleValue());
      }

      return null;
   }

   @Override public Symbol visitExprInt(dimensionsParser.ExprIntContext ctx) {
      return new Symbol(new DoubleType(), new DoubleValue(Double.parseInt(ctx.INTEGER().getText())));
   }

   @Override public Symbol visitExprMultDiv(dimensionsParser.ExprMultDivContext ctx) {
      String op = ctx.op.getText();

      Symbol v1 = visit(ctx.expr(0));
      Symbol v2 = visit(ctx.expr(1));

      Type resType = null;
      
      if (!v1.dim().equals("")) {
         if (v1.dim().equals(v2.dim()))
            resType = v1.type();
         else {
            if (!v2.dim().equals("")){
               // check if complex dimension exists
               String unit = ((DimensionsType) v1.type()).getUnit()+op+((DimensionsType)v2.type()).getUnit();
               for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()){
                  if (dimensionsType.getUnits().containsKey(unit)) {
                     resType = dimensionsType;
                  }
               }
               if (resType == null){
                  ErrorHandling.printError(ctx, "Dimension with the unit \""+unit+"\" does not exist.");
                  return null;
               }
            } else
               resType = v1.type();
         }
      } else
         resType = new DoubleType();  

      switch (op) {
         case "*":
            return new Symbol(resType,  v1.value().setDoubleValue(v1.value().doubleValue() * v2.value().doubleValue());
         case "/":
            if v2.value().doubleValue()==0.0{
               ErrorHandling.printError(ctx, "Can't divide by zero.");
               return null;
            }
            return new Symbol(resType,  v1.value().setDoubleValue(v1.value().doubleValue() / v2.value().doubleValue());
      }
      
      return null;
   }

   @Override public Symbol visitExprPower(dimensionsParser.ExprPowerContext ctx) {
      Symbol v1 = visit(ctx.expr(0));
      Symbol v2 = visit(ctx.expr(1));

      Type resType = null;

      if (!v1.dim().equals("")){
         if (v1.dim().equals(v2.dim()))
            resType = v1.type();
         else {
            if (!v2.dim().equals("")){
               String unit = ((DimensionsType) v1.type()).getUnit()+op+((DimensionsType)v2.type()).getUnit();
               for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()){
                  if (dimensionsType.getUnits().containsKey(unit)) {
                     resType = dimensionsType;
                  }
               }
               if (resType == null){
                  ErrorHandling.printError(ctx, "Dimension with the unit \""+unit+"\" does not exist.");
                  return null;
               }
            }  else
            resType = v1.type();
         }
      } else
         resType = new DoubleType();

      return new Symbol(resType, v1.value().setDoubleValue(Math.pow(v1.value().doubleValue(),v2.value().doubleValue()));
   }

   @Override public Symbol visitExprID(dimensionsParser.ExprIDContext ctx) {
      String unit = ctx.ID().getText();
      // check if ID exists
      for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()){
         if (dimensionsType.getUnits().containsKey(unit)) {
            Symbol temp;
            temp = new Symbol(dimensionsType, new DoubleValue(dimensionsType.getUnits().get(unit)));
            temp.setDim(dimensionsType.name());
            return temp;
         }
      }
      ErrorHandling.printError(ctx, "Unit \""+unit+"\" not defined.");
      return null;
   }


   @Override public Symbol visitDimSign(dimensionsParser.DimSignContext ctx) {
       if (ctx.sign.getText().equals("-")) {
         Symbol sym = visitChildren(ctx);
         sym.value().setDoubleValue(-sym.value().doubleValue());
         return sym;
      }
      return visitChildren(ctx);
   }
   
   @Override public Symbol visitDimPower(dimensionsParser.DimPowerContext ctx) {
      return visitChildren(ctx);
   }

   // @Override public Symbol visitDimUnn(dimensionsParser.DimUnnContext ctx) {
   //    return visitChildren(ctx);
   // }

   @Override public Symbol visitDimMultDiv(dimensionsParser.DimMultDivContext ctx) {
      String op = ctx.op.getText();

      Type resType = null;
      
      
      
      return null;
   }

   @Override public Symbol visitDimID(dimensionsParser.DimIDContext ctx) {
      return visitChildren(ctx);
   }
}