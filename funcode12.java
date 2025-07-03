package FUNCTION;

public class funcode12 {
    // multiple function with the same name but different parameters is called function overloading
    public static int multiply( int a, int b){
        int p=a*b;
        return p;
    }
    public static float multiple(float a, float b){
        float c= a*b;
        return c;
         
    }
public static void main(String args[]){
     System.out.println(multiple(2,3));
     System.out.println(multiple(2.3f,2.3f));
}
}
