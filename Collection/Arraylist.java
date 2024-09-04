package Collection;
import java.util.Scanner;

import ishtiaque.ishtiaque;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
ArrayList<String>arr=new ArrayList<>(Arrays.asList("ishtiaque","mahmud","fahim"));

System.out.println(arr.get(1  ));
System.out.println(arr.size());

arr.add("loves");
System.out.println(arr.get(3));

arr.set(0,"Anika");
System.out.println(arr.get(0));

arr.remove(0);
System.out.println(arr.get(0));

System.out.println(arr);

arr.add(0,"ishtiaque");
System.out.println(arr);

arr.add("Anika");

arr.add(4,"Anika");
System.out.println(arr);




    }

}
