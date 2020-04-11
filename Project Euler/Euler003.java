class Euler003 {
	public static boolean isPrime(long i) {
		for (long x = 2; x < i; x++) {
			if (i % x == 0) {
				return false;
			}
		}
		return true;
	}

	public static long factors(long a) {
		for (long b = 2; b < a; b++) {
			if (a % b == 0 & isPrime(b)) {
				System.out.print(b + " ");
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(factors(600851475143L));
	}
}