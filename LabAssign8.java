
import javax.swing.JOptionPane;


/**
 * program that adds methods to lab 7
 * @author katie sipos CIT 111 MW11
 * 11/12/2017
 */
public class LabAssign8 {

    public static void main(String[] args) 
    {
      char userGuess, coinToss;
      boolean resultOfToss, programContinue;
      int numWin, numLoss;
      
      numWin = 0;
      numLoss = 0;
      programContinue = true;
      
      while(programContinue)
      {
      userGuess = getUsersGuess();
      coinToss = tossCoin();
      resultOfToss = determineTheWinner(userGuess,coinToss);
      
      if(resultOfToss == true)
      {
          JOptionPane.showMessageDialog(null, "You win!");
          numWin +=1;
      }
      else
      {
          JOptionPane.showMessageDialog(null, "Computer wins!");
          numLoss +=1;
      }
      
      programContinue = doContinue();
      }
      
      JOptionPane.showMessageDialog(null, "Your score is " + numWin + " wins and " + numLoss + " losses.");
        
      System.exit(0);
    }
    
    public static char getUsersGuess()
    {
        char userGuess;
        
        userGuess = JOptionPane.showInputDialog(null, "Enter H for heads, \n Enter T for tails").toLowerCase().charAt(0);
        
        return userGuess;
    }
    
    public static char tossCoin()
    {
       double randomNum;
       char cToss;
       randomNum = Math.random();
       
       cToss = 'X';
       
       if(randomNum < 0.5)
       {
          cToss = 'H';
       }
       
       else if(randomNum >= 0.5)
       {
          cToss = 'T';
       }
       
       return cToss;
    }
    
    public static boolean determineTheWinner(char userGuess, char coinToss)
    {
      boolean tossComparison;
      
      
      if(userGuess == coinToss )
      {
          
          tossComparison = true;    
      }
      
      else if(userGuess == 't' && coinToss == 'T')
      {
          
          tossComparison = true;        
      }
      
      else
      {
          tossComparison = false;
      }
        return tossComparison;
      
    }
    
    public static boolean doContinue()
    {
        char keepPlaying;
        boolean trueFalseContinue;
        
        keepPlaying = JOptionPane.showInputDialog(null, "Do you want to continute? Type Y or N").toLowerCase().charAt(0);
        
        if(keepPlaying == 'y')
        {
            trueFalseContinue = true;
        }
        else
        {
            trueFalseContinue = false;
        }
        return trueFalseContinue;
       

    }
    
    
}

