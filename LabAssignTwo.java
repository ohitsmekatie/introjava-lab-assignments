
/**
 * Lab assignment 2
 * @author katie sipos
 * 9/5/2017
 */
public class LabAssignTwo {

    public static void main(String[] args) {
           int acre = 43560;
           int totalLand = 389767;
           
           // casting acre as a double to get the proper formatting in the answer
           double totalAcres = totalLand / (double)acre;
           
           System.out.println("There are " + totalAcres + " acres in " + totalLand + " square feet.");
                  
                   
    }
    
}
