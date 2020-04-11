// 1-14-2018 @Sameer Kapoor
import java.util.Scanner;
class GenderGame {
	public static void main(String[] args) {
		String gender, married, firstName, lastName;
		int age;

		Scanner keyboard = new Scanner(System.in);

		// get gender
		System.out.print("What is your gender (M or F): ");
		gender = keyboard.next();

		// get first and last name
		System.out.print("First name: ");
		firstName = keyboard.next();
		System.out.print("Last name: ");
		lastName = keyboard.next();

		// get age
		System.out.print("Age: ");
		age = keyboard.nextInt();

		if (age < 20 && gender.equals("M"))
			System.out.println("Then I shall call you " + firstName
								+ " " + lastName + ".");
		if (age > 20 && gender.equals("M"))
			System.out.println("Then I shall call you Mr. " + 
								firstName + " " + lastName + ".");
		if (gender.equals("F")) {
			//ask if married
			if (age > 20) {
				System.out.print("\nAre you married, " + 
							firstName + " (y or n)? ");
				married = keyboard.next();

				if (married.equals("y"))
					System.out.println("Then I shall call you " +
									"Mrs. " + lastName + ".");
				else
					System.out.println("Then I shall call you " +
									 "Ms. " + lastName + ".");
			}

			if (age < 20) {
				System.out.println("Then I shall call you " + 
						firstName + " " + lastName + ".");
			}

		}


	}
}
