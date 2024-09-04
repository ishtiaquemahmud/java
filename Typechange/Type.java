package Typechange;
import java.util.Scanner;

public class Type {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please insert a double value");
        double a=sc.nextDouble();
        System.out.println("double value is "+a);
        int i=(int)a;
        System.out.println("integer value is "+i);
        int c=100;
        int e=300;

        
        System.out.println(Math.pow(a,i));
        System.out.println(Math.sqrt(i));
        System.out.println(Math.exp(i));
        System.out.println(Math.log(i));
       int max=Math.max(Math.max(i,e),c);
       System.out.println(max);
       System.out.println(Math.random());
        
    }
    
}
