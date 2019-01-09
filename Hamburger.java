public class Hamburger
{
   //This is a class called hamburger
   //from this class, we can make as many hamburger instances(objects) as we want
   //instance variables
   private boolean hasLettuce;
   private int numPatties;
   private String cheeseType;
   
   //zero argument instructor
   //this runs every time a zeroing hamburger is made
   //always named public className
   //System.out.println("A hamburger was created");
   public Hamburger()
        {
            System.out.println("A hamburger was created");
            this.hasLettuce = false; //gets all instance variables to generic values.
            this.numPatties = 0;
            this.cheeseType = null;
            //toString method
            
        }
   //multi arg constructor
   public Hamburger(boolean hasLettuce, int numPatties, String cheeseType)
   {
       this.hasLettuce = hasLettuce; //set instance variables to parameters
       this.numPatties = numPatties;
       this.cheeseType = cheeseType;
   }
   public String toString()
            {
                String output="Has lettuce: " + this.hasLettuce + "\nPatties: " + this.numPatties + 
                "\nCheese type: " + this.cheeseType;
                return output;
            }
}
