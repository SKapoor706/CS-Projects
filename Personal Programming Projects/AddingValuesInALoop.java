import java.util.Scanner;
class AddingValuesInALoop {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int num = 1;
		int total = 0;
		System.out.println("I will add up the numbers you give me.");

		while (num != 0) {
			System.out.print("Number: ");
			num = keyboard.nextInt();
			total += num;
		}

		System.out.println("The total is " + total + ".");

	}
}