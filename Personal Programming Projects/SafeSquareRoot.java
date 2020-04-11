// 1-21-2018 @Sameer Kapoor
import java.util.Scanner;
class SafeSquareRoot {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num = 1;

		System.out.println("SQUARE ROOT!");
		while (num >= 0) {
			System.out.print("Enter a number: ");
			num = keyboard.nextInt();
			if (num < 0)
				break;
			System.out.println("The square root of " + num + " is " + Math.sqrt(num));
		}	

		while (num < 0) {
			System.out.println("You can't take the square root of a negative number, silly.");
			System.out.print("Try again: ");
			num = keyboard.nextInt();
			System.out.println("The square root of " + num + " is " + Math.sqrt(num));
		}
	}
}
