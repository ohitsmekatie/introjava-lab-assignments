
/**
 * Lab assignment three bonus (using JOptionPane)
 * @author katie sipos CIT111 MW11
 * 9/14/2017
 */

import javax.swing.JOptionPane;

public class LabAssignThreeBonus {

    public static void main(String[] args) {
       
        int milesDriven;
        double gallonsUsed;
        String str;
        double totalMilesPerGallon;
        
        str = JOptionPane.showInputDialog("Enter the miles driven: ");
        milesDriven = Integer.parseInt(str);
        
        str = JOptionPane.showInputDialog("Enter the gallons of gas used: ");
        gallonsUsed = Double.parseDouble(str);
        
        totalMilesPerGallon = milesDriven / gallonsUsed;
        System.out.println("The miles-per-gallon based on the data entered is " + totalMilesPerGallon);
        
        System.exit(0);
    }
    
}
