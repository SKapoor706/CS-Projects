class Euler001 {
	public static void main(String[] args) {
		int x;
		int sum = 0;
		for (x = 0; x < 1000; x++) {
			if (x % 3 == 0 | x % 5 == 0) {
				sum = sum + x;
			}
		}
		System.out.println(sum);
	}
}
