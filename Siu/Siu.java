package Siu;
import java.util.Scanner;

public class Siu {
    
    private String id;
    private String name;
    private double cgpa;
     
     public void insert_record(String id,String name ,double cgpa)
     {
         this.id=id;
         this.name=name;
         this.cgpa=cgpa;
     }
     
     public void display_record()
     {
        System.out.println("\nHERE ARE THE INFORMATIONS\n");
         System.out.println("ID is :"+id);
         System.out.println("NAME is :"+name);
         System.out.println("CG is :"+cgpa);
     }
     
     
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("PLEASE PUT THE STUDENT'S ID, NAME AND CGPA");

        String a =sc.nextLine();
        String b=sc.nextLine();
        double c=sc.nextDouble();

      Siu p=new Siu();
      p.insert_record(a, b, c);
      p.display_record();
  }
     
  }
  


    

