public class DoubleValue extends Value
{
   public DoubleValue(double val)
   {
      setDoubleValue(val);
   }

   @Override
   public Type type()
   {
      return type;
   }

   @Override
   public void setDoubleValue(double val)
   {
      this.val = val;
   }

   @Override
   public double doubleValue()
   {
      return val;
   }

   @Override
   public String toString()
   {
      return ""+val;
   }

   private double val;

   private static Type type = new DoubleType();
}

