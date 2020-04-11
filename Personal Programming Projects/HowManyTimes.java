import java.util.Random;
import java.util.Scanner;
class HowManyTimes {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		int a[] = new int[10];
		int times = 0;
		System.out.print("Array: ");
		for (int x = 0; x < a.length; x++) {
			int ranNum = 1 + r.nextInt(50);
			a[x] = ranNum;
			System.out.print(a[x] + " ");
		}
		System.out.println("\n");
		System.out.print("Value to find: ");
		int value = keyboard.nextInt();

		for (int i : a) {
			if (i == value) {
				times++;
			}
		}
		System.out.println(value + " was found " + times + " times.");
	}
}