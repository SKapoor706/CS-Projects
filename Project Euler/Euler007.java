// 4-4-2018 @Sameer Kapoor
class Euler007 {
	public static boolean isPrime(int n) {
		for (int x = 2; x < n; x++) {
			if (n % x != 0 & x != n & x != 1) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		int counter = 0;
		for (int a = 2; a <= Integer.MAX_VALUE; a++) {
			if (counter == 10001) {
				break;
			}
			if (isPrime(a)) {
				System.out.println(a);
				counter++;
			}
		}
	}
}
