import java.util.Random;
class CopyingArrays {
	public static void main(String[] args) {
		Random r = new Random();
		int a1[] = new int[10];
		int a2[] = new int[10];
		a1 = a2;
		System.out.print("Array 1: ");
		for (int x = 0; x < a1.length; x++) {
			int random = 10 + r.nextInt(90);
			a1[x] = random;
			a1[a1.length - 1] = -7;
			System.out.print(a1[x] + " ");
		}
		System.out.println();
		System.out.print("Array 2: ");
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");

		}
	}
}