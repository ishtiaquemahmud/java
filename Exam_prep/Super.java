package Exam_prep;

public class Super extends Sub {
    public double cg;
    public String department;


    public void fahim()
    {
        super.fahim();
        System.out.println("mahmud");
    }



     public void addition(int a, int b)
    {
       
        System.out.println(a+b);
        
    }


     public void addition(int a, int b,int c)
    {
       
        System.out.println(a+b+c);
        
    }


   
    public static void main(String[] args) {
        Super p=new Super();
        p.name="ishtiaque";
        p.age=23;
        p.cg=3.33;
        p.department="CSE";
        
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.cg);
        System.out.println(p.department);

        p.addition(33, 7);
        p.addition(1,2, 3);
        p.fahim();
       
        
        




    }
    
    
}
