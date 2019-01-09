public class HolidayCharacter
{
    private String Name;
    private boolean real;
    private int age;
    
    public HolidayCharacter()
    {
        this.Name = null;
        this.real = false;
        this.age = 0;
    }
    public HolidayCharacter(String Name, boolean real, int age)
    {
        this.Name = Name;
        this.real = real;
        this.age = age;
    }
    public String toString()
    {
        String output = ("Name: " + this.Name + "\nReal: " + this.real + "\nAge: " + this.age);
        return output;
    }
}
