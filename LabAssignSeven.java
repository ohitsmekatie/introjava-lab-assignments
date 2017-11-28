
import javax.swing.JOptionPane;


/**
 * A program to simulate a head/tails coin toss - keeps track of wins 
 * @author katie sipos CIT111 MW11
 * 10/23/2017
 */
public class LabAssignSeven {

    public static void main(String[] args) {
        
        // variables
 
        double randomNum;
        int numWins, numLosses;
        char keepPlaying, headTailInput;
       
        // Assigning the variables y and 0 as a starting point 
        keepPlaying = 'y';
        numWins = 0;
        numLosses = 0;
        
        // while loop that calculates wins/losses based on comparison of user input to the output of Math.random() method
        while(keepPlaying == 'y')
        {
            
            headTailInput = JOptionPane.showInputDialog(null,"Enter 'H' for heads, \n Enter 'T for tails: \n").toLowerCase().charAt(0);
            
            randomNum = Math.random();
        
            if(headTailInput == 'h' && randomNum < 0.5)
                
            {
                numWins += 1;
                JOptionPane.showMessageDialog(null, "You win!");           
            }
        
            else if(headTailInput == 't' && randomNum >= 0.5)
            {
                numWins += 1;
                JOptionPane.showMessageDialog(null, "You win!");
            }
            
            // final else to cover the case of user putting h and being > .5 and t and being < .5 -- opposite of the if and else if 
            else
            {
                numLosses += 1;
                JOptionPane.showMessageDialog(null, "Computer wins!");
            }
        
            keepPlaying = JOptionPane.showInputDialog(null, "Enter 'Y' to play again, 'N' to quit: \n").toLowerCase().charAt(0);
            
        
        }
        
        JOptionPane.showMessageDialog(null, "Your score is " + numWins + " wins and " + numLosses + " losses.");
        
      System.exit(0);
      
    }
    
}
