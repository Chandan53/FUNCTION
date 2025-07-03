package FUNCTION;
// In function any change it will stay in the function only it will not come to our main function

public class funcode9 {
    public static void swap(int a, int b){
        int temp =a;
        a= b;
        b= temp;

    }
    public static void main(String args[]){
      int a=23;
      int b=54;
      swap(a,b);
      System.out.println(a);
      System.out.println(b);
      

     
    }
    
}
