import java.util.Scanner;

public class Factorial {

	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		char quit = 'a';
		int i;
		
		while (quit != 'n') {
		
			System.out.println("Enter in N: ");
			int num = keyboard.nextInt();
			i = num -1;
			
			while (i > 0) {
				num = num * i;
				i--;
			}
		
			System.out.println("Factorial = " + num);
			System.out.println("Do you want to continue? (y/n)");
			 quit = keyboard.next().charAt(0);
		}
		
		System.out.println("Have a good day");
		keyboard.close();
	}
}
