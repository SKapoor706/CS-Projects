// 3-4-2018 @Sameer Kapoor
import java.util.Random;
class BasicArrays2 {
	public static void main(String[] args) {
		Random r = new Random();
		int a[] = new int[10];
		for (int x = 0; x < a.length; x++) {
			int random = 1 + r.nextInt(100);
			a[x] = random;
			System.out.println("Slot " + x + " contains " + a[x]);
		}

	}
}
