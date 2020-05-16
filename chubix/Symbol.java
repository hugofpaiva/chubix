public class Symbol {
    private final String name;
    private final Type type;
    private Value value;
    private boolean valueDefined;
    private String varName;
    //private String unit = "";

    public Symbol(String name, Type type) {
        assert name != null;
        assert type != null;

        this.name = name;
        this.type = type;
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