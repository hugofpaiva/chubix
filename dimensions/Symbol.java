public class Symbol {
    private final String name;                  // var_x
    private final Type type;                    // Integer
    private Value value;                        // 2
    private boolean valueDefined;               // true
    private String varName;                     // ?
    private String unit;                        // m
    private String dimName;                     // Distancia

    public Symbol(String name, Type type) {
        assert name != null;
        assert type != null;

        this.name = name;
        this.type = type;
    }

    public void setDim(String dimName) {
        assert dimName != null;

        this.dimName = dimName;
    }

    public void setUnit(String unit) {
        assert unit != null;

        this.unit = unit;
    }

    public void setValue(Value value) {
        assert value != null;

        this.value = value;
    }

    public String name(){
        return name;
    }

    public void setVarName(String varName) {
        assert varName != null;

        this.varName = varName;
    }

    public String varName(){
        return varName;
    }

    public Type type(){
        return type;
    }

    public void setValueDefined(){
        valueDefined = true;
    }

    public boolean valueDefined(){
        return valueDefined;
    }

    public Value value(){
        assert valueDefined();

        return value;
    }
}