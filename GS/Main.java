package GS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scan =new Scanner(System.in);
        System.out.println("please put the name and score");
        String a=scan.nextLine();
        int b=scan.nextInt();



        Set p=new Set();
        p.setName(a);
        p.setScore(b);


        System.out.println(p.getName());
        System.out.println(p.getScore());
        
    }
    
}
