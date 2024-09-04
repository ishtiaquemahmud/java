package Inheritance;
import java.util.Scanner;

class Sub extends Super {
    int id;
    double cgpa;

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("please put the name ");
        String a=sc.nextLine();
        System.out.println("please put the name of your department ");
        String b =sc.nextLine();
        System.out.println("please put your id ");
        int c=sc.nextInt();
        System.out.println("please put the cgpa");
        double d=sc.nextDouble();


        Sub p=new Sub();
        p.name=a;
        p.department=b;
        p.id=c;
        p.cgpa=d;

        System.out.println("\nname is   :  "+p.name);
        System.out.println("depertment is   :  "+p.department);
        System.out.println("id is  :  "+p.id);
        System.out.println("cgpa is  :  "+p.cgpa);
    }

    
}
