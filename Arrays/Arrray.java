package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Arrray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please put the length of the array");
        int a=scan.nextInt();

        int[]siu=new int[a];
        System.out.println(siu.length);
        System.out.println("please put the values of the array");

        for(int i=0;i<siu.length;i++)
        {
        int c=scan.nextInt();
            siu[i]=c;
            
        }

        
        System.out.println(Arrays.toString(siu));


        for(int i=0;i<siu.length;i++)
        {
            System.out.println(siu[i]);
            
        }
        

        System.out.println("please put the index number of the value you want to see");
        int  f=scan.nextInt();
        System.out.println(siu[f]);
        
    }
}
