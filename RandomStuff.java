public class RandomStuff
{
    public static void main() {
       //cast a random number to an integer
       for (int i=0; i<5; i++)
            {
                int age = (int)(Math.random()*367+7);
       
        
                System.out.println("The number is " + age + "!"); 
            }
    }
}