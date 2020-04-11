// 3-31-2018 @Sameer Kapoor
import java.util.Scanner;
class Calculator {
	public static double Calculate(double a, double b, String op) {
		double c = 0;
		if (op.equals("+")) {
			c = a + b;
		}
		else if (op.equals("-")) {
	    	c = a - b;
		}
		else if (op.equals("*")) {
			c = a * b;
		}
		else if (op.equals("/")){
			c = a / b;
		}
		else if (op.equals("^")) {
			c = (double) Math.pow(a, b);
		}

		return c;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double num1, num2;
		String operator;

		while (true) {
			num1 = keyboard.nextDouble();
			if (num1 == 0) {
				System.out.println("Bye Now.");
				break;
			}
			operator = keyboard.next();
			num2 = keyboard.nextDouble();

			double total = Calculate(num1, num2, operator);
			System.out.println(total);
		}
	}
		
}
