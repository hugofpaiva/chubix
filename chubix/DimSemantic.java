import static java.lang.System.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class DimSemantic extends dimensionsBaseVisitor<Symbol> {

   @Override public Symbol visitRelativeDim(dimensionsParser.RelativeDimContext ctx) {
      String dim = ctx.ID(0).getText();
      
      if (dimensionsParser.dimTable.containsKey(dim)) {
         ErrorHandling.printError(ctx, "Dimension \""+ dim +"\" already defined.");
         return null;
      }
      
      Symbol symb = visit(ctx.unitdim());
      if(symb==null){
         return null;
      }
      DimensionsType relDim = (DimensionsType) symb.type();

      for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()) {
         if (dimensionsType.containsUnit(relDim.getUnit())) {
            ErrorHandling.printError(ctx, "Unit \""+DimensionsType.mapToString(relDim.getUnit())+"\" already defined.");
            return null;
         }
      }

      Type type = relDim.getType();
      
      if (ctx.ID(1)!=null) {
         String newUnit = ctx.ID(1).getText();
         HashMap<String, Integer> unit = new HashMap<>();
         unit.put(newUnit,1);
         
         for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()) {
            if (dimensionsType.containsUnit(unit)) {
               ErrorHandling.printError(ctx, "Unit \""+DimensionsType.mapToString(unit)+"\" already defined.");
               return null;
            }
         }

         DimensionsType newRelDim = new DimensionsType(dim, relDim.getUnit(), type);
         newRelDim.addUnit(unit, 1.0);

         dimensionsParser.dimTable.put(dim, newRelDim);

      } else {
         DimensionsType newRelDim = new DimensionsType(dim, relDim.getUnit(), type);
   
         dimensionsParser.dimTable.put(dim, newRelDim);
         
      }
      
      return null;
   }

   @Override public Symbol visitPrimitiveDim(dimensionsParser.PrimitiveDimContext ctx) {
      String dim = ctx.ID(0).getText();
      String newUnit = ctx.ID(1).getText();
      HashMap<String, Integer> unit = new HashMap<>();
      unit.put(newUnit,1);
      visit(ctx.type());
      Type type = ctx.type().res;
      if (dimensionsParser.dimTable.containsKey(dim)) {
         ErrorHandling.printError(ctx, "Dimension \""+ dim +"\" already defined.");
         return null;
      }
      
      for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()) {
         if (dimensionsType.containsUnit(unit)) {
            ErrorHandling.printError(ctx, "Unit \""+DimensionsType.mapToString(unit)+"\" already defined.");
            return null;
         } 
      }
      dimensionsParser.dimTable.put(dim, new DimensionsType(dim, unit, type));

     
      return null;
   }

   @Override public Symbol visitUnit(dimensionsParser.UnitContext ctx) {
      String dim = ctx.ID(0).getText();

      if (!dimensionsParser.dimTable.containsKey( dim )) {
         ErrorHandling.printError(ctx, "Dimension \""+ dim +"\" not defined.");
         return null;
      }

      DimensionsType dimType = dimensionsParser.dimTable.get(dim);

      String newUnit = ctx.ID(1).getText();
      HashMap<String, Integer> unit = new HashMap<>();
      unit.put(newUnit,1);

      for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()) {
         if (dimensionsType.containsUnit(unit)) {
            ErrorHandling.printError(ctx, "Unit \""+DimensionsType.mapToString(unit)+"\" already defined.");
            return null;
         }
      }

      Symbol sym = visit(ctx.expr());
      if(sym == null) {
         return null;
      }
      if (!sym.type().isDimensional()) {
         ErrorHandling.printError(ctx, "Conversion expression must be a unit.");
         return null;
      }
      Type dimUnit = sym.type();
   
      if (!dimType.containsUnit(((DimensionsType) dimUnit).getUnit())) {  
         ErrorHandling.printError(ctx, "Dimension \""+ dimType.name() +"\" and \""+ ctx.expr().getText()+"\" are not compatible.");
         return null;
      }

      Double convert_value = sym.value().doubleValue();
      if (convert_value==0) {  
         ErrorHandling.printError(ctx, "Cannot add a unit with value 0.");
         return null;
      }
      dimensionsParser.dimTable.get(dim).addUnit(unit, convert_value);
      return null;
   }


   @Override public Symbol visitExprSign(dimensionsParser.ExprSignContext ctx) {
      if (ctx.sign.getText().equals("-")) {
         Symbol sym = visitChildren(ctx);
         if(sym==null){
            return null;
         }
         sym.value().setDoubleValue(-sym.value().doubleValue());
         return sym;
      }
      return visitChildren(ctx); 
   }

   @Override public Symbol visitExprUnn(dimensionsParser.ExprUnnContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Symbol visitExprDouble(dimensionsParser.ExprDoubleContext ctx) {
      return new Symbol(new DoubleType(), new DoubleValue(Double.parseDouble(ctx.DOUBLE().getText())));
   }

   @Override public Symbol visitExprID(dimensionsParser.ExprIDContext ctx) {
      String newUnit = ctx.ID().getText();
      HashMap<String, Integer> unit = new HashMap<>();
      unit.put(newUnit,1);

      for (DimensionsType dimensionsType : dimensionsParser.dimTable.values()){
         if (dimensionsType.containsUnit(unit)) {
            Symbol temp = new Symbol(dimensionsType, new DoubleValue(dimensionsType.getUnitConv(unit)));
            return temp;
         }
      }
      ErrorHandling.printError(ctx, "Unit \""+unit+"\" not defined.");
      return null;
   }

   @Override public Symbol visitExprSumMin(dimensionsParser.ExprSumMinContext ctx) {
      String op = ctx.op.getText();
      Symbol v1 = visit(ctx.expr(0));
      Symbol v2 = visit(ctx.expr(1));
      if(v1==null || v2 == null){
         return null;
      }
      Symbol resSymb;
      Type type = new DoubleType();
      if (v1.type().isDimensional() && v2.type().isDimensional()){
         if(!((DimensionsType)v2.type()).getUnit().equals(((DimensionsType) v1.type()).getUnit())){
            ErrorHandling.printError(ctx, "Dimensions \""+ v1.type().name() +"\" and \""+ v2.type().name()+"\" are not compatible.");
            return null;
         }
         switch (op) {
            case "+":
               resSymb = new Symbol(v1.type(), new DoubleValue(v1.value().doubleValue() + v2.value().doubleValue()));
               return resSymb;
            case "-":
               resSymb = new Symbol(v1.type(), new DoubleValue(v1.value().doubleValue() - v2.value().doubleValue()));
               return resSymb;
         }
      } else if (v1.type().isDimensional()) {
         type = v1.type();
      } else if( v2.type().isDimensional()){
         type = v2.type();
      }

      switch (op) {
         case "+":
            resSymb = new Symbol(type, new DoubleValue(v1.value().doubleValue() + v2.value().doubleValue()));
            return resSymb;
         case "-":
            resSymb = new Symbol(type,  new DoubleValue(v1.value().doubleValue() - v2.value().doubleValue()));
            return resSymb;
      }
      return null;
   }


   @Override public Symbol visitExprMultDiv(dimensionsParser.ExprMultDivContext ctx) {
      String op = ctx.op.getText();
      Symbol s1 = visit(ctx.expr(0));
      Symbol s2 = visit(ctx.expr(1));
      if(s1==null || s2==null){
         return null;
      }

      Type resType = new DoubleType();
      Symbol resSymb;
      
      if (s1.type().isDimensional() && s2.type().isDimensional()){
         HashMap<String,Integer> map_1 = ((DimensionsType) s1.type()).getUnit();
         HashMap<String,Integer> map_2 = ((DimensionsType) s2.type()).getUnit();
         HashMap<String,Integer> map1 = new HashMap<>();
         map1.putAll(map_1);
         HashMap<String,Integer> map2 = new HashMap<>();
         map2.putAll(map_2);
         switch (op) {
            case "*":
               map1.forEach((k, v) -> map2.merge(k, v, (v1, v2) -> v1 + v2));
               map2.values().removeIf(f -> f == 0f);

               resSymb = new Symbol(new DimensionsType("", map2, new DoubleType()), new DoubleValue(s1.value().doubleValue() * s2.value().doubleValue()));
               return resSymb;
            case "/":
               map2.forEach((k, v) -> map2.put(k,-v));
               map2.forEach((k, v) -> map1.merge(k, v, (v1, v2) -> v1 + v2));

               map1.values().removeIf(f -> f == 0f);

               resSymb = new Symbol(new DimensionsType("", map1, new DoubleType()), new DoubleValue(s1.value().doubleValue() / s2.value().doubleValue()));
               return resSymb;
         }
      } else if (s1.type().isDimensional()) {
         resType = s1.type();
      } else if (s2.type().isDimensional()) {
         resType = s2.type();
      }
      
      switch (op) {
         case "*":            
            resSymb = new Symbol(resType, new DoubleValue(s1.value().doubleValue() * s2.value().doubleValue()));
            return resSymb;
         case "/":
            resSymb = new Symbol(resType, new DoubleValue(s1.value().doubleValue() / s2.value().doubleValue()));
            return resSymb;
      }
      
      return null;
   }

   @Override public Symbol visitExprPower(dimensionsParser.ExprPowerContext ctx) {
      Symbol v1 = visit(ctx.expr(0));
      Symbol v2 = visit(ctx.expr(1));
      if(v1==null || v2==null){
         return null;
      }
      
      if (v2.type().isDimensional()){
         ErrorHandling.printError(ctx, "Cannot calculate expressions to the power of a Dimension.");
         return null;
      } else if (v1.type().isDimensional()){
         DimensionsType dim1 = ((DimensionsType) v1.type());
         HashMap<String,Integer> map_1 = dim1.getUnit();
         HashMap<String,Integer> map1 = new HashMap<>();
         map1.putAll(map_1);

         map1.forEach((k, v) -> {
            map1.put(k, (int) map1.get(k)*(int) v2.value().doubleValue());
         });
         
         dim1.setUnit(map1);
         return new Symbol(dim1, v1.value());
      }
      v1.setValue(new DoubleValue(Math.pow(v1.value().doubleValue(), v2.value().doubleValue())));
      return v1;
   }

   @Override public Symbol visitDimPower(dimensionsParser.DimPowerContext ctx) {
      Symbol s1 = visit(ctx.unitdim());
      Type resType = null;
      if(s1==null){
         return null;
      }
      DimensionsType dim1 = (DimensionsType) s1.type();
      HashMap<String,Integer> map_1 = dim1.getUnit();
      HashMap<String,Integer> map1 = new HashMap<>();
      map1.putAll(map_1);

      int i;

      if (ctx.DOUBLE().getText().indexOf('.') >= 0)
         ErrorHandling.printWarning(ctx, "Loss of precision when powering to Double.");
      
      if (ctx.sign != null)
         i = (int) Double.parseDouble(ctx.sign.getText()+ctx.DOUBLE().getText());
      else
         i = (int) Double.parseDouble(ctx.DOUBLE().getText());

      if(i==0){
         ErrorHandling.printError(ctx, "Power of 0 is not possible when defining a dimension.");
         return null;
      }

      map1.forEach((k, v) -> {
         map1.put(k, (int) (v*i));
      });

      dim1.setUnit(map1);

      Symbol resSymb = new Symbol(dim1, new DoubleValue(1.0));

      return resSymb;
   }

   @Override public Symbol visitDimUnn(dimensionsParser.DimUnnContext ctx) {
      return visit(ctx.unitdim());
   }

   @Override public Symbol visitDimMultDiv(dimensionsParser.DimMultDivContext ctx) {
      Symbol s1 = visit(ctx.unitdim(0));
      Symbol s2 = visit(ctx.unitdim(1));
      Type resType = null;
      if(s1==null || s2==null){
         return null;
      }
      
      DimensionsType dim1 = (DimensionsType) s1.type();
      DimensionsType dim2 = (DimensionsType) s2.type();
      HashMap<String,Integer> map_1 = dim1.getUnit();
      HashMap<String,Integer> map_2 = dim2.getUnit();
      HashMap<String,Integer> map1 = new HashMap<>();
      map1.putAll(map_1);
      HashMap<String,Integer> map2 = new HashMap<>();
      map2.putAll(map_2);

      switch(ctx.op.getText()){
         case "*":
            map1.forEach((k, v) -> map2.merge(k, v, (v1, v2) -> v1 + v2));
            map2.values().removeIf(f -> f == 0f);

            dim2.setUnit(map2);
            break;
         case "/":
            map2.forEach((k, v) -> map2.put(k,-v));
            map2.forEach((k, v) -> map1.merge(k, v, (v1, v2) -> v1 + v2));
            map1.values().removeIf(f -> f == 0f);
            
            dim2.setUnit(map1);
            break;
      }
   
      if ( (dim1.getType().name().equals("integer")) && (dim2.getType().name().equals("integer")) )
         dim2.setType(new IntegerType());
      else 
         dim2.setType(new DoubleType());

      Symbol resSymb = new Symbol(dim2, new DoubleValue(1.0));
      return resSymb;
   }

   @Override public Symbol visitDimID(dimensionsParser.DimIDContext ctx) {
      String dim = ctx.ID().getText();
      for (String dimName : dimensionsParser.dimTable.keySet()){
         if (dimName.equals(dim)) {
            HashMap<String, Integer> unit = new HashMap<>();
            unit.putAll(dimensionsParser.dimTable.get(dimName).getUnit());
            Symbol temp = new Symbol(new DimensionsType("", unit, dimensionsParser.dimTable.get(dimName).getType()), new DoubleValue(1.0));
            return temp;
         }
      }
      ErrorHandling.printError(ctx, "Dimension \""+dim+"\" not defined.");
      return null;
   }
}