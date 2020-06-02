public class BooleanType extends Type {
   public BooleanType() {
      super("boolean");
   }

   @Override
   public boolean isNumeric() {
      return false;
   }
}
 
 