import java.util.Random;
import java.util.Scanner;
class OneShotHiLo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int num, guess;
		num = 1 + r.nextInt(100);

		System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
		guess = keyboard.nextInt();

		if (guess == num) {
			System.out.println("You guessed it! What are the odds?!?");
		}

		else {
			if (guess < num)
				System.out.println("Sorry, you are too low.  I was thinking of " + num + ".");
			else 
				System.out.println("Sorry, you are too high. I was thinking of " + num + ".");
		}
	}
}