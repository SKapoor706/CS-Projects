import java.util.Random;
class BasicArrays3 {
	public static void main(String[] args) {
		Random r = new Random();
		int num[] = new int[1000];
		for (int x = 0; x < num.length; x++) {
			int random = 10 + r.nextInt(90);
			num[x] = random;
			System.out.print(num[x] + "\t");
		}
	}
}