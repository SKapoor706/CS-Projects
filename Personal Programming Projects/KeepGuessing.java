import java.util.Random;
import java.util.Scanner;
class KeepGuessing {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		int num, guess;
		num = 1 + r.nextInt(10);

		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess: ");
		guess = keyboard.nextInt();

		while (guess != num) {
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
		}

		System.out.println("That's right! You're a good guesser.");
	}
}