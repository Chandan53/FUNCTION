package FUNCTION;

public class funcode16 {
    public static void DECtoBIN(int decnum){
        int pow=0;
        int binnum=0;
        while(decnum>0){
            int rem= decnum%2;
            binnum=binnum+(rem* (int) Math.pow(10, pow));
            pow++;
            decnum=decnum/2;

        }
        System.out.println( " binary number is " + binnum);
    }
    public static void main(String args[]){
        DECtoBIN(6);
    }
    
}
