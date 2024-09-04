package Aanimal;

public class Lion extends Animal {
    public void make_sound()
    {
        System.out.println("roar");
    }
    
    public static void main(String[] args) {
        Lion p=new Lion();
        p.make_sound();
        p.eat();
        p.sleep();
    }
}
