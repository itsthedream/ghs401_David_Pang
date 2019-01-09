import javax.swing.JOptionPane;
public class Grade
{
    public static void main()
    {
        int grade = -1;
        while (grade < 0 || grade >100)
        {
            grade = Integer.parseInt(JOptionPane.showInputDialog("What is your grade?"));
        }
        if (grade < 60)
        {
            System.out.println("Take a hike.");
        }
        else if (grade < 70)
        {
            System.out.println("You are passing with a D.");
        }
        else if (grade < 80)
        {
            System.out.println("You are passing with a C.");
        }
        else if (grade < 90)
        {
            System.out.println("You are passing with an B.");
        }
        else
        {
            System.out.println("You are passing with an A.");
        }
    }    
}
