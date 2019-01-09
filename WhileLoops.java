import javax.swing.JOptionPane;
public class WhileLoops
{
    public static void main()
    {
        int num = -1;
        while (num < 0 || num > 120)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
        }
        System.out.println("Thank you");
    }
}
