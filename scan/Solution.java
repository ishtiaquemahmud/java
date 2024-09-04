package scan;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /*  Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d =scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);*/
       /*  Scanner sc=new Scanner(System.in);
        String b=sc.next();
        int a=sc.nextInt();
        System.out.println(b+a);*/
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-14s %03d\n", s1, x);
            }
            System.out.println("================================");



    }
}