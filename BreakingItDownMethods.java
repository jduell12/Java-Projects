import java.util.*;

public class BreakingItDownMethods {
	Scanner scan = new Scanner(System.in);
	int operand1, operand2, answer;
	char operator = 'q';
	boolean keepCalculating = true;
	
	public char getOperator() {
			boolean operator_is_good = false;
			
			do {
				System.out.println("Enter an Operator: + - * / q for quit: ");
				String strOperator = scan.nextLine();
				strOperator = strOperator.trim();
				if (strOperator.length() == 0) {
					continue;
				}
				operator = strOperator.charAt(0);
				operator_is_good = false;
				
				switch (operator) {
					case 'q': 
						operator_is_good = true;
						break;
					case '+': 
						operator_is_good = true;
						break;
					case '-':
						operator_is_good = true;
						break;
					case '*':
						operator_is_good = true;
						break;
					case '/':
						operator_is_good = true;
						break; 
					default:
						System.out.println("Your operator is bad ... try again");
						break;
				}
			} while (!operator_is_good);
			
		return operator;
	}
	
	public int getOperand1() {
		
		int which = 1;
		System.out.println("Enter operand " + which);
		String input;
		
		boolean operand_is_bad;
		
		do {
			operand_is_bad = false;
			
			input = scan.nextLine();
			input = input.trim();
			if (input.length() == 0) {
				operand_is_bad = true;
			}
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (c < '0' || c > '9') {
					operand_is_bad = true;
					System.out.println("Your last input was bad, try again");
				}
			}
		} while (operand_is_bad);
		
		operand1 = Integer.parseInt(input);
		return operand1;
	}
	
	public int getOperand2() {
		int which = 2;
		System.out.println("Enter operand " + which);
		String input;
		
		boolean operand_is_bad;
		
		do {
			operand_is_bad = false;
			
			input = scan.nextLine();
			input = input.trim();
			if (input.length() == 0) {
				operand_is_bad = true;
			}
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (c < '0' || c > '9') {
					operand_is_bad = true;
					System.out.println("Your last input was bad, try again");
				}
			}
		} while (operand_is_bad);
		
		operand2 = Integer.parseInt(input);
		return operand2;
	}
	
	public int doArithmetic() {
		switch (operator) {
		case '+' :
			answer = operand1 + operand2;
			break;
		case '-':
			answer = operand1 - operand2;
			break;
		case '*':
			answer = operand1 * operand2;
			break;
		case '/':
			answer = operand1/operand2;
			break;
		default:
			System.out.println("We shouldn't get her in doArithmetic!!!");
			answer = -1;
			break; 
		}
		return answer; 
	}
	
	
}
