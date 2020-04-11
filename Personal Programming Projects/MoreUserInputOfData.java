import java.util.Scanner;
class MoreUserInputOfData {
	public static void main(String[] args) {
		String firstname;
		String lastName;
		int grade;
		int IDNum;
		String login;
		double GPa;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.println();
		System.out.println("First name: ");
		firstname = keyboard.next();
		System.out.println("Last name: ");
		lastName = keyboard.next();
		System.out.println("Grade (9-12): ");
		grade = keyboard.nextInt();
		System.out.println("Student ID: ");
		IDNum = keyboard.nextInt();
		System.out.println("Login: ");
		login = keyboard.next();
		System.out.println("GPA (0.0-4.0): ");
		GPa = keyboard.nextDouble();

		System.out.println("Your information: ");
		System.out.println("\tLogin: " + login);
		System.out.println("\tID: " + IDNum);
		System.out.println("\tName: " + lastName + ", " + 
							firstname);
		System.out.println("\tGPA: " + GPa);
		System.out.println("\tGrade: " + grade);
	}
}