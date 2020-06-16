import java.util.Map;
import java.util.HashMap;

public class SymbolTable {
    private Map<String, Symbol> table = new HashMap<>();

    public boolean exists(String name) {
        return table.containsKey(name);
    }

    public void put(String name, Symbol value) {
        table.put(name, value);
    }

    public Symbol get(String name) {
        return table.get(name);
    }
}