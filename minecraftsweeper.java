
import javax.swing.JOptionPane;
public class minecraftsweeper
{
    public static void main()
    {
        int list = -1;
        while(list < 10 || list > 100)
        {
            list = Integer.parseInt(JOptionPane.showInputDialog("Choose a number between 10 and 20 inclusive."));
        }
        int[] array = new int[list];
        for (int i = 0 ;i < list; i++)
        {
            array[i] = (int)(Math.random()*91)+10;
            System.out.print(array[i] + " ");
        }
        int greatest = 0;
        int least = 101;
        for (int i = 0 ;i < list; i++)
        {
            if (array[i] > greatest)
            {
                greatest = array[i];
            }
        }
        System.out.print("\ngreatest " + greatest);
        for (int i = 0 ;i < list; i++)
        {
            if (array[i] < least)
            {
                least = array[i];
            }
        }
        System.out.print("\nleast " + least);
    }
}
