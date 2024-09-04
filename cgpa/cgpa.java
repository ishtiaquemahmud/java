package cgpa;
import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        System.out.println("Enter the number of courses ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;

     System.out.println("put the marks ");

     for(int i=1;i<=a;i++)
     {
        int m=sc.nextInt();
        sum+=m;
     }   
      double avg=sum/a;
     // System.out.println("average is "+avg);

      if(avg>=80  && avg<=100)
      {
        System.out.println("cgpa is 4.00");
      }
      else if(avg>=40 )
      {
        System.out.println("passed");
      }
      else
      System.out.println("failed");
        
    }
}
