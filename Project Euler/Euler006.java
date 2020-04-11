// 4-4-2018 @Sameer Kapoor
class Euler006 {
	public static int sumOfSquares(int n) {
		int sum1 = 0;
		for (n = 1; n <= 100; n++) {
			sum1 += (int) Math.pow(n, 2);
		}
		return sum1;
	}

	public static int squareOfSum(int a) {
		int add = 0;
		for (a = 1; a <= 100; a++) {
			add += a;
		}
		int sum2 = (int) Math.pow(add, 2);
		return sum2;
	}

	public static void main(String[] args) {
		int answer = squareOfSum(1) - sumOfSquares(1);
		System.out.println(answer);

	}
}
