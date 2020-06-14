import java.util.ArrayList;

public class FunctionType extends Type{
    private ArrayList<Type> argsType = new ArrayList<Type>();
    private Type returnType;


    public FunctionType(Type returnType){
        super("function");
        this.returnType = returnType;
    }

    @Override
    public String name(){
        return returnType.name();
    }

    public Type getType(){
        return returnType;
    }
   
    public ArrayList<Type> getArgs(){
        return this.argsType;
    }
    
    public void addArg(Type type){
        this.argsType.add(type);
    }
}