package Animal;



public class Main {
    public static void main(String[] args) {
        System.out.println("FOR LION : ");
        System.out.println();

        Lion a=new Lion();
        a.eat();
        a.move();
        a.hunt();
        a.life();
        System.out.println();

        System.out.println("FOR BIRD :");
        System.out.println();
        Bird b=new Bird();
        b.eat();
        b.move();
        b.fly();
        b.life();
        System.out.println();

        System.out.println("FOR HUMAN : ");
        System.out.println();
        Human c=new Human();
        c.eat();
        c.move();
        c.talk();
        c.life();



        
    }
    
}
