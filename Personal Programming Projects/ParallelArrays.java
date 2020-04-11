import java.util.Scanner;
class ParallelArrays {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String names[] = { "Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks" };
		double grades[] =  { 99.2, 89.1, 92.9, 83.3, 78.8 };
		int id[] = { 123456, 198765, 234567, 987654, 345678, };
		int slot = 0;

		System.out.println("Values: ");
		for (int i = 0; i < names.length; i++) {
			System.out.print("\t" + names[i] + " " + grades[i] + " " + id[i]);
			System.out.println("\n");
		}

		System.out.print("\nID number to find: ");
		int number = keyboard.nextInt();

		for (int x = 0; x < id.length; x++) {
			if (number == id[x]) {
				slot = x;
				System.out.print("\nFound in slot " + slot);
			}
		}

		System.out.println("\n\tName: " + names[slot]);
		System.out.println("\tAverage: " + grades[slot]);
		System.out.println("\tID: " + id[slot]);
	}
}