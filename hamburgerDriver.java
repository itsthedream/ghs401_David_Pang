
public class hamburgerDriver
{
    public static void main()
    {
        //make one instance or object of the hamburger class
        Hamburger hamburger1= new Hamburger();
        Hamburger hamburger2= new Hamburger(false, 52, "Lactose Intolerant");
        Hamburger hamburger3= new Hamburger(true, 3, "Cheddar");
        //print the ToString of the object
        System.out.println(hamburger1.toString());
        System.out.println(hamburger2.toString());
        System.out.println(hamburger3.toString());
    }
}
