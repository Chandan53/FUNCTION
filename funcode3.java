package FUNCTION;
import java.util.*;

public class funcode3 {
    public static int sum(int a , int b){
        int add =a +b;
        return add;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int adding =sum(a,b);
        System.out.println(" using parameters adding two number  = " + adding);
    }
    
    
}
