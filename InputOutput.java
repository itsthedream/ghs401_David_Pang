
/**
 * Write a description of class InputOutput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;

public class InputOutput
{
    //Bora is fine
    
   public static void main(){
       String username = JOptionPane.showInputDialog("Please enter your username:"); 
       String password = JOptionPane.showInputDialog("Please enter your password:"); 
       if (password.equals("Borasucks") && username.equals("Bora")) {
           System.out.println("Access Granted.");
        }
       else {   
           System.out.println("Access Denied.");
        }
        /*if (username.equals("Bora")) {
           System.out.println("Access Granted.");
        }
       else {   
           System.out.println("Access Denied.");
        } */
        
    }
    }
