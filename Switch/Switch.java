package Switch;
import java.util.Scanner;

public class Switch {
    public Switch()
    {
        System.out.println("welcome to the name game");
    }
    
    public static void main(String[] args) {
        Switch d=new Switch();
        
        System.out.println("what is your name?");
        Scanner scan =new Scanner(System.in);
        String name=scan.nextLine();


        switch(name)
        {
            case "ishtiaque":
            System.out.println("nice name boiiiiiiiiiiiiiiiiiiiiiiii");
            System.out.println("do you need something   ?");
            break;

            case "omim":
            System.out.println("ewwwwww get lost man ");
            break;

            case "nipun":
            case "labib":
            System.out.println("yeeee kon hein?");
            break;

            default:
            System.out.println("give me a nice name man what is this ");
            break;


        }
        
    }
    
}
