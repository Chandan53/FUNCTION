package FUNCTION;

public class funcode14 {
    public static boolean isprime(int n){
        boolean isprime=true;
        if(n==1){
            isprime=false;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        return isprime;


    }
    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print( i +" ");

            }
            
        }
        System.out.println();
    }
    public static void main(String args[]){
        primeInRange(20);

    }
    
}
