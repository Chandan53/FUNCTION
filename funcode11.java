package FUNCTION;
import java.util.*;

public class funcode11 {
    public static int factorial(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    // 5! = 5*4*3*2*1=120
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(" factorial of " + a  + " is = " + factorial(a));


       
}
}
