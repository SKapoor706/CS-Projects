import java.util.Scanner;

class AddingValuesForLoop {
	public static void main(String[] args) {
		int sum = 0, x;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Number: ");
		int num = keyboard.nextInt();
		System.out.println();

		for(x = 1; x <= num; x++)
			System.out.print(x + " ");
			sum = sum + x;

		System.out.println();
		System.out.println("The sum is " + sum + ".");
	}
}
