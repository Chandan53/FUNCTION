package FUNCTION;

public class funcode8 {
    public static void swap_two_no(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("updated value of  a is  " + a  +"  b  is  " + b);
        

    }
    public static void main(String args[]){
        int a=10;
        int b=2;
        swap_two_no(10,2);
    }
    
}
