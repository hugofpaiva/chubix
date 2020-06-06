abstract public class Value
{
   public Type type()
   {
      assert false;
      return null;
   }

   public void setIntValue(int val)
   {
      assert false;
   }

   public void setDoubleValue(double val)
   {
      assert false;
   }

   public void setBoolValue(boolean val)
   {
      assert false;
   }

   public void setStringValue(String val)
   {
      assert false;
   }

   public int intValue()
   {
      assert false;
      return 0;
   }

   public double doubleValue()
   {
      assert false;
      return 0;
   }
   public boolean boolValue()
   {
      assert false;
      return false;
   }

   public String stringValue()
   {
      assert false;
      return "";
   }

   public Value sum(Value v2){
      if (this.type().name().equals("integer")){
         if (v2.type().name().equals("integer"))
            return new IntegerValue(this.intValue()+v2.intValue());
         else
            return new DoubleValue(this.intValue()+v2.doubleValue());
      } else {
         if (v2.type().name().equals("integer"))
            return new DoubleValue(this.doubleValue()+v2.intValue());
         else
            return new DoubleValue(this.doubleValue()+v2.doubleValue());
      }
   }

   public Value sub(Value v2) {
      if (this.type().name().equals("integer")){
         if (v2.type().name().equals("integer"))
            return new IntegerValue(this.intValue()-v2.intValue());
         else
            return new DoubleValue(this.intValue()-v2.doubleValue());
      } else {
         if (v2.type().name().equals("integer"))
            return new DoubleValue(this.doubleValue()-v2.intValue());
         else
            return new DoubleValue(this.doubleValue()-v2.doubleValue());
      }
   }

   public Value div(Value v2) {
      if (this.type().name().equals("integer")){
         if (v2.type().name().equals("integer"))
            return new IntegerValue(this.intValue()/v2.intValue());
         else
            return new DoubleValue(this.intValue()/v2.doubleValue());
      } else {
         if (v2.type().name().equals("integer"))
            return new DoubleValue(this.doubleValue()/v2.intValue());
         else
            return new DoubleValue(this.doubleValue()/v2.doubleValue());
      }
   }

   public Value mul(Value v2) {
      if (this.type().name().equals("integer")){
         if (v2.type().name().equals("integer"))
            return new IntegerValue(this.intValue()*v2.intValue());
         else
            return new DoubleValue(this.intValue()*v2.doubleValue());
      } else {
         if (v2.type().name().equals("integer"))
            return new DoubleValue(this.doubleValue()*v2.intValue());
         else
            return new DoubleValue(this.doubleValue()*v2.doubleValue());
      }
   }
}