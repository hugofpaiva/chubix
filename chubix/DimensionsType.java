
import java.util.HashMap;

public class DimensionsType extends Type {
    //private HashMap<String, Double> units;
    private Integer id = 0; 
    private Type dimType;
    private HashMap<Integer, HashMap<String,Integer>> units; // ID : [["m" : 1], ["s" : -1]]  
    private HashMap<Integer, Double> unit_conv;                         // ID : 1.0
    private HashMap<String,Integer> defaultUnit;             // [["m" : 1], ["s" : -1]] 

    public DimensionsType(String name, HashMap<String,Integer> unit, Type dimType) {
        super(name);
        assert unit != null;
        assert dimType != null;
        this.units = new HashMap<>();
        this.defaultUnit = unit;
        this.units.put(this.id,unit);
        this.unit_conv.put(this.id++,1.0);
        this.dimType = dimType;
    }

    // public boolean containsUnit(String unit){
    //     return false;
    // }

    public boolean containsUnit(HashMap<String,Integer> unit){
        for (HashMap<String,Integer> val : units.values()) {
            if (val.equals(unit))
                return true;
        }
        return false;
    }

    public Double getUnitConv(HashMap<String,Integer> unit){    
        for (Integer id : units.keySet()) {
            if (this.units.get(id).equals(unit))
                return unit_conv.get(id);
        }
        return 0.0;
    }

    @Override public boolean isDimensional() {
        return true;
   }

    @Override public boolean isNumeric() {
        return true;
    }
    

    //  public boolean conformsTo(Type other) {
    //      return other.name().equals(this.name());
    //  }

    public void addUnit(HashMap<String,Integer> unit, Double value) {
        assert unit != null;
        assert value != null;
        this.units.put(id,unit);
        this.unit_conv.put(id++,value);
    }

    public Type getType(){
        return this.dimType;
    }

    public void setType(Type dimType) {
        this.dimType = dimType;
    }

    public HashMap<Integer, HashMap<String,Integer>> getUnits(){
        return units;
    }

    public void setUnits(HashMap<Integer, HashMap<String,Integer>> units){
        this.units = units;
    }

    public HashMap<String,Integer> getUnit(){
        return defaultUnit;
    }

    public void setUnit(HashMap<String,Integer> unit){
        this.defaultUnit=unit;
    }
    
    public String getJavaType(){
		return this.dimType.getJavaType();
	}

    public static String mapToString(HashMap<String, Integer> map) {
        String str = "";
        for (String unit : map.keySet())
            str += unit +"^" +map.get(unit) + "*";
        str = str.substring(0, str.length()-1);
        return str;
    }
}