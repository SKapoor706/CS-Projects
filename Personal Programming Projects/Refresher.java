// 2-18-2018 @Sameer Kapoor
import java.util.Scanner;
class Refresher {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name = keyboard.next();
		System.out.println();
		if (name.equals("Mitchell")) {
			for (int x = 1; x <= 5; x++) {
				System.out.println(name);
			}
		}
		else  {
			for (int i = 1; i <=10; i++) {
				System.out.println(name);
			}
		}
	}
}
