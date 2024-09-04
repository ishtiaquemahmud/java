package Aanimal;

public class Elephant extends Animal {
    public void make_sound()
    {
        System.out.println("Trampet");

    }
    
    public static void main(String[] args) {
        Elephant p=new Elephant();
        p.make_sound();
        p.eat();
        p.sleep();
    }
    
}
