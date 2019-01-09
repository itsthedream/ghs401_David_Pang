public class Driver
{
    public static void main()
    {
        Song song5= new Song();
        Song song1= new Song();
        Song song2= new Song("Despacito", "T-Series", 399, 4.20);
        Student student1= new Student();
        Student student2= new Student("Jeremy", "J-Town", 3, 5.0);
        
        System.out.println(song1.toString() + "\n");
        System.out.println(song2.toString()+ "\n");
        System.out.println(student1.toString()+ "\n");
        System.out.println(student2.toString()+ "\n");
    }
}
