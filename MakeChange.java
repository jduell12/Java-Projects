import java.util.Scanner;
import java.text.DecimalFormat;

public class MakeChange {
	  public static void main(String[] args) {
           
        //Sets the decimal format
		   DecimalFormat df = new DecimalFormat("###.00");
		   Scanner input = new Scanner(System.in);
		   
		   System.out.println("How much does the item cost? (Please use a decimal notation to separate the dollars from the cents)");
		   double cost = input.nextDouble();
		   System.out.println("How much money has been tendered? (Please use a decimal notation to separate the dollars from the cents)");
		   double tendered = input.nextDouble();
		   double change = (tendered - cost);
		   
		  int dollars = (int) change;
		  
		  String moneyString = df.format(change);
//		   String changeString = Double.toString(change);
		   String [] parts = moneyString.split("\\.");
		   String part2 = parts[1];
		   double cents5 = Double.parseDouble(part2);
		   
		   int cents = (int) cents5;
		   int quarters = cents / 25;
		   int centsOne = cents % 25;
		   int dimes = centsOne /10;
		   int centsTwo = centsOne %10;
		   int nickels = centsTwo / 5; 
		   int centsThree = centsTwo%5;
		   int pennies = centsThree; 
		   
		   
		  
		   
		   System.out.println("The cost of the item was $" + cost + " and the amount tendered was $" + tendered);
		   System.out.println("Change returned: ");
		   System.out.println(dollars + " dollar(s)");
		   System.out.println(quarters + " quarter(s)");
		   System.out.println(dimes + " dime(s)");
		   System.out.println(nickels + " nickel(s)");
		   System.out.println(pennies + " pennies");
		    
		   input.close();
		  }
}
