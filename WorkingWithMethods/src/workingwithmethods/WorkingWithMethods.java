
package workingwithmethods;

import javax.swing.JOptionPane;

/**
 *
 * @author kiaanmaharaj
 */
public class WorkingWithMethods {

    public static void main(String[] args) {
        
        String response = null;
        
        // Get an input from the user
        //response = JOptionPane.showInputDialog(null,"Enter your name");
        //response = JOptionPane.showInputDialog(null, "This is a message", "This is the title", JOptionPane.OK_OPTION);
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item ?", "Delete Item ",JOptionPane.YES_NO_CANCEL_OPTION);
        
        // Cancel   No   Yes
        //  2       1      0
        System.out.println(option);
        
        if(option == 0 )
        {
            System.out.println("The item has now been deleted");
        }else if (option == 1)
        {
            System.out.println("You clicked No");
        }else if (option == 2)
        {
            System.out.println("You clicked Cancel ");
        }
        
        /*
             if(option == 0 ) 
            System.out.println("The item has now been deleted");
        else if (option == 1)
            System.out.println("You clicked No");
        else if (option == 2)
            System.out.println("You clicked Cancel ");
        */
        
        
        JOptionPane.showMessageDialog(null, "This is the value we got from the user "+response);
        
    }

}