public class Student
{
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    
    public Student()
    {
        
        this.firstName = "Noel";
        this.lastName = "Mattern";
        this.age = 2;
        this.gpa = 2.3;
        System.out.println("3");
    }
    public Student(String firstName, String lastName, int age, double gpa)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        System.out.println("4");
    }
    public String toString()
    {
        String output= ("First Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nAge: " + this.age + "\ngpa: "
        + this.gpa);
        return output;
        
    }   
}