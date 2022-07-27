import java.util.Scanner;

public class Calculator {


	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Please enter operand 1: ");
		//int a = scanner.nextInt();
		//System.out.println("Please enter operand 2: ");
		//int b = scanner.nextInt();
		//scanner.nextLine();
		//System.out.println("Please enter operator: ");
		//String operator = scanner.nextLine();

		/*int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		String operator = args[0];

		CalculatorService calculatorService = new CalculatorService();

		float result = calculatorService.getResult(a, b, operator);*/
		process(args);
//	 	args[3] = result+"";
	}

	static boolean isNumeric(String arg) {
		try {
			Integer.parseInt(arg);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	static float process(String[] args) {
		String operator = null;
		int operand1;
		int operand2;

		// see whather it is infix or postfix
		// determine the operator and operands
		boolean isPrefix = false;

		if (isNumeric(args[0]) &&
		isNumeric(args[2])) {
			isPrefix = false;
			operator = args[1];
			operand1 = Integer.parseInt(args[0]);
			operand2 = Integer.parseInt(args[2]);
		} else {
			isPrefix = true;
			operator = args[0];
			operand1 = Integer.parseInt(args[1]);
			operand2 = Integer.parseInt(args[2]);
		}

		// calculatorSErvice.getResult()
		CalculatorService calculatorService = new CalculatorService();
		float result = calculatorService.getResult(operand1, operand2, operator);

		return result;
	}
}

