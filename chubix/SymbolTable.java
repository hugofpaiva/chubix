import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class SymbolTable {
    private static int tab = 0;
    private HashMap<String, Symbol> symbols = new HashMap<>();
    private SymbolTable parent;
    private List<SymbolTable> childs = new ArrayList<SymbolTable>();
    private int i = 0;
    
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

    public SymbolTable down() {
        return childs.get(i++);
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
    
    @Override public String toString() {
        System.out.print(" ".repeat(tab*8));
        System.out.printf("--%8s : %10s : %8s--%n" , "TYPENAME", "NAME", "VARNAME");
        for (Symbol s : this.symbols.values()) {
            System.out.print(" ".repeat(tab*8));
            System.out.printf("%10s : %10s : %10s %n" , s.type().name(), s.name(), "?");
        }
        System.out.print(" ".repeat(tab*8));
        System.out.println("-------------------------------------");
        tab++;
        for (SymbolTable st : childs)
            System.out.println(st);
        tab--;
        return "";
    }
    
}
