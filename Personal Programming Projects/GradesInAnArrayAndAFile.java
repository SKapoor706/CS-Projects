import java.util.Scanner;
import java.util.Random;
class GradesInAnArrayAndAFile {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int grades[] = new int[5];
		System.out.print("Name (first last) ");
		String name = keyboard.next();
		System.out.print("Filename ");
		String filename = keyboard.next();
		System.out.println("Here are your randomly-selected grades (hope you pass):");

		for (int x = 0; x < 5; x++) {
			int grade = 1 + r.nextInt(100);
			grades[x] = grade;
			System.out.println("Grade " + (x + 1) + ": " + " " + grades[x]);
		}
	}
}