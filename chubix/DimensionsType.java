
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

public class DimensionsType extends Type {
    //private HashMap<String, Double> units;
    private Integer id = 0; 
    private Type dimType;
    private HashMap<Integer, HashMap<String,Integer>> units = new HashMap<>();; // ID : [["m" : 1], ["s" : -1]]  
    private HashMap<Integer, Double> unit_conv = new HashMap<>();                        // ID : 1.0
    private HashMap<String, Integer> defaultUnit = new HashMap<>();              // [["m" : 1], ["s" : -1]] 

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

    public DimensionsType(String name, HashMap<String,Integer> unit, Type dimType, Double value) {
        super(name);
        assert unit != null;
        assert dimType != null;
        this.units = new HashMap<>();
        this.defaultUnit = unit;
        this.units.put(this.id,unit);
        this.unit_conv.put(this.id++,value);
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

    public static String mapToString(HashMap<String, Integer> map) { // chico, velocity é m/s^-1??????????? print de merda
        String str = "";
        ArrayList<String> pos = new ArrayList<>();
        ArrayList<String> neg = new ArrayList<>();
        for (Entry<String, Integer> entry : map.entrySet()) {
        	Integer exp = entry.getValue();
            String newUnit =( (exp!=1) ? entry.getKey()+"^"+( (exp<0) ? -exp: exp ) :  entry.getKey());
            
            if (exp > 0)
            	pos.add(newUnit);
        	else
        		neg.add(newUnit);
        }
        if (pos.size()>0) {
	        if (pos.size()>1)
	        	str+="( ";
	    	for (String unit : pos)
	    		str+=unit+" * ";
	
	        str = str.substring(0, str.length()-3);
	        if (pos.size()>1)
	        	str+=" )";
        } else
        	str+="1";
        
        if (neg.size()>0) {
        	str+=" / ";
        	if (neg.size()>1)
            	str+="( ";
        	for (String unit : neg)
        		str+=unit+" * ";
            str = str.substring(0, str.length()-3);
        	if (neg.size()>1)
            	str+=" )";
        }
        return str;
    }
}