package GS;

public class Set {
    private String name;
    private int score;
public void setName(String name) 
{
    if(name.equals("Ifti"))
    {
      this.name="this dude is stupid";
    }
    else{
        this.name=name;
    }

}


public String getName(){
    return this.name;
}


public void setScore(int score)
{
    if(score==10)
    {
        this.score=score;

    }
    else{
        System.out.println("your score is less than 10 in here if your score is less than 10 it is considered as 0");
        this.score=0;
    }

}


public int getScore(){
    return this.score;
}

    
}
