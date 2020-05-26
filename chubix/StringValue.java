public class StringValue extends Value
{
   public StringValue(String val)
   {
      setStringValue(val);
   }

   @Override
   public Type type()
   {
      return type;
   }

   @Override
   public void setStringValue(String val)
   {
      this.val = val;
   }

   @Override
   public String stringValue()
   {
      return val;
   }

   @Override
   public String toString()
   {
      return ""+val;
   }

   private String val;

   private static StringType type = new StringType();
}
