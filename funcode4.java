package FUNCTION;
import java.util.*;

public class funcode4 {
    public static String username(){
        Scanner sc=new Scanner(System.in);
        String name =sc.nextLine();
       // System.out.println(name);
        return name;
    }
    public static void main(String args[]){
        System.out.println(" name of the user is  " + username());
    }
    
}
