
/**
 * Lab Assignment Three 
 * @author katie sipos CIT111 MW11
 * 9/14/2017 
 */
import java.util.Scanner;
        
public class LabAssignThree {

    public static void main(String[] args) {
        
        int milesDriven;
        double gasUsed;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the miles driven: --> ");
        milesDriven = keyboard.nextInt();
        
        System.out.print("Enter the gallons of gas used: --> ");
        gasUsed = keyboard.nextDouble();
        
        double totalMilesPerGallon = milesDriven / gasUsed;
        
        System.out.println("The miles-per-gallon based on the data entered is " + totalMilesPerGallon);
        
        
        
        
    }
    
}
