import java.util.Random;
import java.util.Scanner;
class NumberGuessingWithACounter {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		int guess = 0, num = 1 + r.nextInt(10), tries = 0;

		System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");

		while (guess != num) {
			System.out.print("Your guess: " );
			guess = keyboard.nextInt();
			System.out.println("That is incorrect. Guess again.");
			tries++;
		}

		System.out.println("That's right! You're a good guesser.");
		System.out.println("It only took you " + tries + " tries.");
	}
}