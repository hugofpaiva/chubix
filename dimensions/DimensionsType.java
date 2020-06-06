import java.util.HashMap;


public class DimensionsType extends Type {
    private HashMap<String, Double> units;
    private Type dimType;
    private String defaultUnit;

    public DimensionsType(String name, String unit, Type dimType) {
        super(name);
        assert unit != null;
        assert dimType != null;
        this.units = new HashMap<>();
        this.defaultUnit=unit;
        this.units.put(unit, 1.0);
        this.dimType = dimType;
    }

    @Override public boolean isNumeric() {
        return true;
    }

    public boolean conformsTo(Type other) {
        return other.name().equals(this.name());
    }

    public void addUnit(String unit, Double value) {
        assert unit != null;
        assert value != null;
        this.units.put(unit,value);
    }

    public Type getType(){
        return this.dimType;
    }

    public HashMap<String, Double> getUnits(){
        return units;
    }

}