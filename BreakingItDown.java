
public class BreakingItDown {
	public static void main (String [] args) {
		BreakingItDownMethods methods = new BreakingItDownMethods();
		int operand1 = 0, operand2 =0, answer = 0;
		char operator ='q';
		boolean keepCalculating = true;
		
		while (keepCalculating) {
		operator = methods.getOperator();
		if (operator == 'q') {
			keepCalculating = false;
			break;
		}
		operand1 = methods.getOperand1();
		operand2 = methods.getOperand2();
		answer = methods.doArithmetic();
		
		
		System.out.println(operand1 + " " + operator + " " + operand2 + " = " + answer);
		System.out.println("====================================");
		}
		
		System.out.println("Finished Calculations");
	}

}
