package FUNCTION;
import java.util.*;

public class funcode15 {
    public static void BINtoDEC(int binnum){
        int pow=0;
        int decnum=0;
        while(binnum>0){
            int lastD=binnum%10;

            decnum=decnum+(lastD* (int)Math.pow(2, pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println("decimal of binary number is = " + decnum);
    }
    
    public static void main(String args[]){
        BINtoDEC(101);
    }
}
