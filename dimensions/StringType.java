public class StringType extends Type {
    public StringType() {
       super("string");
    }
    
    @Override public boolean isNumeric() {
       return false;
    }
}