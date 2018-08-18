import java.util.Scanner;

public class Newton_Method {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter in N for Newton:");
		double num = keyboard.nextDouble();
		
		
		double guess =  (num/2);
		double accuracy = Math.abs(guess);
		double sqrt = Math.sqrt(num);
		
		while (accuracy > 0.000001) {
			double newGuess = ((num/guess) + guess)/2;
			accuracy = Math.abs(newGuess - guess);
			if (newGuess < guess) {
				guess = newGuess;
			}
		}
		
		System.out.println("Newton (" + num + ") = " + guess);
		System.out.println("Math.sqrt = " + sqrt);
		
		keyboard.close();
	}

}
