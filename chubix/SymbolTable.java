import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class SymbolTable {
    private HashMap<String, Symbol> symbols = new HashMap<>();
    private SymbolTable parent;
    private List<SymbolTable> childs = new ArrayList<SymbolTable>();
    
    public SymbolTable(){
        this(null);
    }

    public SymbolTable(SymbolTable parent){
        this.parent = parent;
    }
    
    public HashMap<String, Symbol> symbols() {
        return symbols;
    }

    public List<SymbolTable> childs() {
        return childs;
    }

    public SymbolTable parent() {
        return parent;
    }

    public SymbolTable addChild(){
        SymbolTable child = new SymbolTable(this);
        childs.add(child);
        return child;
    }

    public void addSymbol(String name, Symbol s){
        symbols.put(name, s);
    }
    
    public boolean contains(String id){
        return symbols.containsKey(id);
    }

    public void put(String name, Symbol s){
        symbols.put(name,s);
    }

    public Symbol lookup(String id) {
        SymbolTable st = this;
        while(st.parent() != null) {
            if (st.contains(id))
                return st.symbols().get(id);
            st = st.parent();
        }
        return null;
    }

}
