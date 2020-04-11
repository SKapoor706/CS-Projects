import java.util.Scanner;
class Keychains1 {
	public static String addKeychains(int c) {
		String choice = "ADD KEYCHAINS";
		if (c == 1) {
		}
		return choice;
	}
	public static String removeKeychains(int c) {
		String choice = "REMOVE KEYCHAINS";
		if (c == 2) {
		}
		return choice;
	}
	public static String viewOrder(int c) {
		String choice = "VIEW ORDER";
		if (c == 3) {
		}
		return choice;
	}
	public static String checkout(int c) {
		String choice = "CHECKOUT";
		if (c == 4) {
		}
		return choice;
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ye Olde Keychain Shoppe\n");
		boolean cond = true;
		while(cond) {
			System.out.println("1. Add Keychains to Order\n2. Remove Keychains from Order\n3. View Current Order\n4. Checkout\n");
			System.out.print("Please enter your choice: ");
			int userInput = keyboard.nextInt();
			if (userInput == 1) {
				System.out.println(addKeychains(userInput));
				System.out.println();
			}
			else if (userInput == 2) {
				System.out.println(removeKeychains(userInput));
				System.out.println();
			}
			else if (userInput == 3) {
				System.out.println(viewOrder(userInput));
				System.out.println();
			}
			else if (userInput == 4) {
				System.out.println(checkout(userInput));
				System.out.println();
				cond = false;
			}
		}
	}
}