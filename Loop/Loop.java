package Loop;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Guess the password");
        String password="fahim";

        Scanner sc=new Scanner(System.in);
        String guess=sc.nextLine();

        while(!guess.equals(password))
        {
            System.out.println("guess the password ");
            guess=sc.nextLine();

        }
        System.out.println("congratulation");
        sc.close();
    }
    
}
