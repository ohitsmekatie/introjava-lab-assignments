
import javax.swing.JOptionPane;


/**
   Lab assignment 4
 * @author katie sipos CIT111 MW11
 * 2/24/207
 */
public class LabAssignFour {

    public static void main(String[] args) {
        
       String UserId;
       int StringLength;
       String SuccessMessage;
       
       UserId =  JOptionPane.showInputDialog("Please enter your user ID: ");
       StringLength = UserId.length();
       
       if(StringLength >= 6 && StringLength < 10)
       {
         SuccessMessage = String.format("Welcome, %s my name is Hal. ", UserId);
         JOptionPane.showMessageDialog(null, SuccessMessage);
       }
       
       else
        {       
            JOptionPane.showMessageDialog(null, "Sorry, User ID is invalid.");
        }
       
    System.exit(0);
              
    }
    
}
