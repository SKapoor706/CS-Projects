import java.util.Scanner;
class LittleQuiz {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int numWrong = 0, numRight = 0, total = 3, choice;
		String YesNo;

		System.out.println("Are you ready for a quiz? ");
		YesNo = keyboard.next();
		System.out.println("Okay, here it comes!");
		System.out.println();

		System.out.println("Q1) What is the capital of Alaska? ");
		System.out.println("\t1) Melbourne\n\t2) Anchorage\n\t3) Juneau");
		choice = keyboard.nextInt();
		if (choice == 3) {
			System.out.println("That's right!");
			numRight++;
		}

		else {
			System.out.println("Incorrect! The answer is Juneau.\n");
			numWrong++;
		}

		System.out.println("Q2) Can you store the value 'cat' in a variable of type int? ");
		System.out.println("\t1) Yes\n\t2) No ");
		choice = keyboard.nextInt();

		if (choice == 2) {
			System.out.println("Thats right!");
			numRight++;
		}

		else {
			System.out.println("Sorry, 'cat' is a string. ints can only store numbers.\n");
			numWrong++;
		}

		System.out.println("Q3) What is the result of 9+6/3? ");
		System.out.println("\t1) 5\n\t2) 11\n\t3) 15/3 ");
		choice = keyboard.nextInt();
		if (choice == 2) {
			System.out.println("That's correct!");
			numRight++;
		}

		else {
			System.out.println("Incorrect! It's 11.");
			numWrong++;
		}

		System.out.println("Overall you got " + numRight + " out of " + total);
		System.out.println("Thanks for playing!");
	}
}
