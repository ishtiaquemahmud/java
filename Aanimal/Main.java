package Aanimal;

public class Main {
    public static void main(String[] args) {
        Animal p=new Lion();
        p.eat();
        p.make_sound();
        p.sleep();
        
        Animal q=new Elephant();
        q.eat();
        q.make_sound();
        q.sleep();
    }
    
}
