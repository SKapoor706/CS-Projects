// 2-9-2018 @Sameer Kapoor
import java.util.Scanner;
class Multiples {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Choose a number: ");
		int num = keyboard.nextInt();
		System.out.println();
		for (int i = 1; i <= 12; i++) {
			int answer = num * i;
			System.out.println(num + " * " + i + " = " + answer);
		}
	}
}
