import java.util.Scanner;
import java.util.Random;
class AgainWithTheNumberGuessing {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		int num = 1 + r.nextInt(10);
		int guess, tries = 0;

		System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
		do {
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();

			if (guess != num) {
				System.out.println("That is incorrect. Guess again.");
				tries++;
			}

		} while (num != guess);

		System.out.println("That's right! You're a good guesser.");
		System.out.println("It only took you " + (tries + 1) + " tries.");
	}
}