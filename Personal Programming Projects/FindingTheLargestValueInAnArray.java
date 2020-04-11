// 3-18-2018 @Sameer Kapoor
import java.util.Random;
class FindingTheLargestValueInAnArray {
	public static void main(String[] args) {
		Random r = new Random();
		int a[] = new int[10];
		int largest = 0;

		System.out.print("Array: ");
		for(int x = 0; x < a.length; x++) {
			int random = 1 + r.nextInt(100);
			a[x] = random;
			System.out.print(a[x] + " ");
		}
		for (int i = 0; i < a.length; i++) {
			if (largest < a[i]) {
				largest = a[i];
			}
		}
		System.out.println("\nThe largest value is " + largest);
	}
}
