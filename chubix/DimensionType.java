import java.util.HashMap;

public class DimensionType extends Type {
    private HashMap<String, Double> units;
    private Type dimType;

    public DimensionType(String name, String unit, Type dimType) {
        super(name);
        assert unit != null;
        assert dimType != null;
        this.units = new HashMap<>();
        this.units.put(unit, 1.0);
        this.dimType=dimType;
    }

    @Override public boolean isNumeric() {
       return true;
    }

    public void addUnit(String unit, Double value) {
        assert unit != null;
        assert value != null;
        this.units.put(unit,value);
    }

    public Type getType(){
        return this.dimType;
    }

    
}