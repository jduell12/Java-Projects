import java.util.Scanner; 
import java.text.DecimalFormat;

public class Jar {
	public static void main(String[] args) {
        // sets the decimal format
	     DecimalFormat df = new DecimalFormat( "###.00" );
        
         // Takes input from the user and converts it to how much money it would be in quarters 
	    Scanner quarter = new Scanner (System.in);
	    System.out.println("Enter in the number of Quarters in the Jar: ");
	    double quarters = quarter.nextInt();
	    double qcents = (quarters * 0.25);
	    
	    // Takes input from the user and converts it to how much money it would be in dimes
	    Scanner dime = new Scanner (System.in);
	    System.out.println("Enter in the number of Dimes in the Jar: ");
	    double dimes = dime.nextInt();
	    double dcents = (dimes * 0.10);
	    
	    // Takes input from the user and converts it to how much money it would be in nickels
	    Scanner nickel = new Scanner (System.in);
	    System.out.println("Enter in the number of Nickels in the Jar: ");
	    double nickels = nickel.nextInt();
	    double ncents = (nickels * 0.05);
	    
	    // Takes input from the user and converts it to how much money it would be in pennies
	    Scanner penny = new Scanner (System.in);
	    System.out.println("Enter in the number of Pennies in the Jar: ");
	    double pennies = penny.nextInt();
	    double pcents = (pennies * 0.01);
        
        //Adds all the monetary values of the inputs given by the user
	    double total = (qcents + dcents + ncents + pcents);
        
	    System.out.println("The Jar contains $" +  df.format(total) + " in quarters, dimes, nickels and pennies.");
	    
	    quarter.close();
	    dime.close();
	    nickel.close();
	    penny.close();
	  }
}
