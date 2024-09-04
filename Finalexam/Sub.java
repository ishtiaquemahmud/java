package Finalexam;
import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {


        Scanner s=new Scanner(System.in);
        System.out.println("please put your name");
        String name=s.nextLine();
        System.out.println("please put your phone number");
        String number=s.nextLine();





        Super p=new Super(name, number);

        Super c=new Super("anika", "99999999999999999999");



        System.out.println(p.getName());
        System.out.println(p.getNumber());


         System.out.println(c.getName());
        System.out.println(c.getNumber());


        
    }

}
