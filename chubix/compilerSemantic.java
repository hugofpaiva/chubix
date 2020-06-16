import java.util.Scanner;

public class compilerSemantic {
    public static Scanner sc = new Scanner(System.in); 


    public static void main(String[] args){
        int v5 = 10;
        double v4 = v5/1.0;
        double v3 = (double)v4;
        double v1 = v3;
        double v6 = v1;
        System.out.println(v6+" [m]");
        double v9 = v1;
        double v8 = v9/1.0;
        double v7 = (double)v8;
        System.out.println(v7+" [m]");
    };
}