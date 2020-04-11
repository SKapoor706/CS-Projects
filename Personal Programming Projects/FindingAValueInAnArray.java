import java.util.Random;
import java.util.Scanner;
class FindingAValueInAnArray {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		int a[] = new int[10];
		System.out.print("Array: ");
		for (int x = 0; x < a.length; x++) {
			int ranNum = 1 + r.nextInt(100);
			a[x] = ranNum;
			System.out.print(a[x] + " ");
		}
		System.out.println("\t");
		System.out.print("Value to find: ");
		int value = keyboard.nextInt();

		for (int i : a) {
			if (i == value) {
				System.out.println(value + " is in the array.");
			}
		}
	}
}