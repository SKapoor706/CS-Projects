// 1-15-2018 @Sameer Kapoor
import java.util.Random;
import java.util.Scanner;
class NumberGuess {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		int num, choice;
		num = 1 + r.nextInt(10);

		// get user choice
		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.print("Your guess: ");
		choice = keyboard.nextInt();

		if (choice == num)
			System.out.println("That's right! My secret number was " + num + "!");
		else
			System.out.println("Sorry, but I was really thinking of " + num + ".");
	}
}
