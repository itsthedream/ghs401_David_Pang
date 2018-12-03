import javax.swing.JOptionPane;

public class quad
{
    public static void main() {
       int avar = Integer.parseInt(JOptionPane.showInputDialog("Value of A?"));
       int bvar = Integer.parseInt(JOptionPane.showInputDialog("Value of B?"));
       int cvar = Integer.parseInt(JOptionPane.showInputDialog("Value of C?"));
       
       
       if(((bvar*bvar)-(4*avar*cvar)) < 0)
       {
           System.out.println("Imaginary Root");
       }
       else if(((bvar*bvar)-(4*avar*cvar)) >= 0)
       {
           System.out.println("The value of b^2 is " + bvar*bvar);
           System.out.println("The value of 4ac is " + 4*avar*cvar);
           System.out.println("The value of the square root b^2-4ac is " + Math.sqrt((bvar*bvar)-(4*avar*cvar)));
           System.out.println("The first root is " + ((((-1*bvar) + (Math.sqrt((bvar*bvar)-(4*avar*cvar))))/(2*avar))));
           System.out.println("The second root is " + ((((-1*bvar) - (Math.sqrt((bvar*bvar)-(4*avar*cvar))))/(2*avar))));
       }           
}
}