import java.util.Scanner;

public class AverageWithException {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);

        // Asks user to enter in a number. If user doesn't enter in a number then an excpetion is thrown and the user is told their input is invalid
		double num1 = 0;
		while (true) {
			System.out.println("Enter a number you want to average: ");
			try {
			 num1 = Double.parseDouble(sc.next());
			 break;
			 } catch (NumberFormatException ignore) {
				 System.out.println("Invalid input.");
			 }
		}
        
        
        // Asks user to enter in a number. If user doesn't enter in a number then an excpetion is thrown and the user is told their input is invalid
		double num2 = 0; 
		while (true) {
			System.out.println("Enter a number you want to average: ");
			try {
				num2 = Double.parseDouble(sc.next());
				break;
			} catch (NumberFormatException ignore) {
				 System.out.println("Invalid input.");
			}
		}
        
        // Asks user to enter in a number. If user doesn't enter in a number then an excpetion is thrown and the user is told their input is invalid
		double num3 = 0;
		while (true) {
			System.out.println("Enter a number you want to average: ");
			try {
				num3 = Double.parseDouble(sc.next());
				break;
			} catch (NumberFormatException ignore) {
				System.out.println("Invalid input.");
			}
		}
	
		// Takes the three numbers entered by user and gets their average. Prints to the user the average
		double average = (num1 + num2 + num3)/ 3;
		System.out.println("The average of " + num1 + " " + num2 + "and " + num3 + " is " + average);
		sc.close();
	}

}
