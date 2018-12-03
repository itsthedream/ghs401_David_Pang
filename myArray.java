public class myArray {
    public static void main()
        {   
            //declare an array of size 12 that holds 12 integers
            int[] myArray = new int[100];
            
            //print the length of the array using the .length call
            System.out.println("The length of the array is " + myArray.length);
            
            //store three arbitrary values in the array in three arbitrary locations
            for(int c=0; c<myArray.length; c++)
                {
                    //store the array as multiples of 5
                    myArray[c] = c*5;
                    System.out.println("The value is " + c + " in the array is " + myArray[c]);
                    
                }
            /*for(int i=0; i<myArray.length; i++) 
            {   
                
                System.out.println("The value of element: " + i + " in the array is " + myArray[i]);
            }*/
        }
}