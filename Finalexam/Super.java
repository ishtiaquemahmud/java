package Finalexam;

public class Super {

    private String name;
    private String number;


    public Super(String name,String number)
    {
        this.setName(name);
        this.setNumber(number);

    }

    public void setName(String name)
    {
        this.name=name;

    }
    public String getName()
    {
        return name;

    }
    public void setNumber(String number)
    {
        this.number=number;

    }
    public String getNumber()
    {
        return number;

    }

}
