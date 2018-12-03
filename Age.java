
import javax.swing.JOptionPane;

public class Age
{   
    public static void main() {
        String age = JOptionPane.showInputDialog("What is your age");
        int result = Integer.parseInt(age);
        if (result >= 16) {
            System.out.println("Welcome home sir!");
        }
        else {
            System.out.println("All your base is ours.");
        }
        
}
}