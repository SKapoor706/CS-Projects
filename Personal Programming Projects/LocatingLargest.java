// 3-25-2018 @Sameer Kapoor
import java.util.Random;
class LocatingLargest {
	public static void main(String[] args) {
		Random r = new Random();
		int a[] = new int[10];
		int largest = 0;
		int slot = 0;

		System.out.print("Array: ");
		for(int x = 0; x < a.length; x++) {
			int random = 1 + r.nextInt(100);
			a[x] = random;
			System.out.print(a[x] + " ");
		}
		for (int i = 0; i < a.length; i++) {
			if (largest < a[i]) {
				largest = a[i];
				slot = i;
			}
		}

		System.out.println("\nThe largest value is " + largest);
		System.out.println("It is in slot " + slot);
	}
}
