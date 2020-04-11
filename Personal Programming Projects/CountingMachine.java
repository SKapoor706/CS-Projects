import java.util.Scanner;
class CountingMachine {
	public static void main(String[] args) {
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Count to: ");
		num = keyboard.nextInt();

		for(int x = 0; x <= num; x++) {
			System.out.print(x + " ");
		}

		
	}
}