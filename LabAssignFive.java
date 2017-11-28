
import javax.swing.JOptionPane;

/**
 * Lab Assignment Five
 * Program that calculates days,hours, minutes, and remaining seconds when
 * prompted for seconds
 *
 * @author katie sipos CIT111 MW11 
 * 
 * 10/1/2017
 */
public class LabAssignFive {

    public static void main(String[] args) {

        int numberOfDays, numberOfHours, numberOfMinutes, numberOfSeconds, input;
        String stringInput, finalMessage;

        stringInput = JOptionPane.showInputDialog(null, "Enter the number of seconds. ");
        input = Integer.parseInt(stringInput);
        
        if(input >= 86400)
        {
            numberOfDays = input / 86400;
            numberOfHours = (input % 86400) / 3600;
            numberOfMinutes = ((input % 86400) % 3600) / 60;
            numberOfSeconds = ((input % 86400) % 3600) % 60;
        
            finalMessage = String.format("There are %d days, %d hours, %d minutes, and %d seconds in the input %,d.", numberOfDays, numberOfHours, numberOfMinutes, numberOfSeconds, input);
            JOptionPane.showMessageDialog(null, finalMessage);
        }
        
        else if(input >= 3600 && input < 86400)
        {
           numberOfHours = (input % 86400) / 3600;
           numberOfMinutes = ((input % 86400) % 3600) / 60;
           numberOfSeconds = ((input % 86400) % 3600) % 60;
           
           finalMessage = String.format("There are %d hours, %d minutes, and %d seconds in the input %,d.", numberOfHours, numberOfMinutes, numberOfSeconds, input);
           JOptionPane.showMessageDialog(null, finalMessage);
        }
        
        else if(input >=60 && input < 3600)
        {
           numberOfMinutes = ((input % 86400) % 3600) / 60;
           numberOfSeconds = ((input % 86400) % 3600) % 60;
           
           finalMessage = String.format("There are %d minutes and %d seconds in the input %,d.", numberOfMinutes, numberOfSeconds, input);
           JOptionPane.showMessageDialog(null, finalMessage);
        }
        
        else if(input < 60)
        {
           finalMessage = String.format("There is less than a minute in %d seconds", input);
           JOptionPane.showMessageDialog(null, finalMessage);
        }
        
        System.exit(0);
    }

}
