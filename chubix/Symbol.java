public class Symbol{
    private final String name;                  // throw
    private Type type;                    // Integer or DimType
    private Value value;                        // 2
    private boolean valueDefined;               // true
    private String varName;                     //v1
    private String unit;                        // m
    private String dimName = "";               // Distancia
    
    // Variable Declaration
    public Symbol(String name, Type type) {
        assert name != null;
        assert type != null;

        this.name = name;
        this.type = type;
    }

    public Symbol(Type type, Value value) {
        assert value != null;
        assert type != null;
        
        this.name = "";
        setValueDefined();
        this.value = value;
        this.type = type;
    }

    public void setDim(String dimName) {
        assert dimName != null;

        this.dimName = dimName;
    }

    public String dim() {
        return dimName;
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