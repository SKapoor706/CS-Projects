class Euler005 {
	public static void main(String[] args) {
		int a, b = 1;
		for (a = 11; a < Integer.MAX_VALUE; a++) {
			if (a % b == 0 && a % (b + 1) == 0 && a % (b + 2) == 0 && a % (b + 3) == 0 && a % (b + 4) == 0 && a % (b + 5) == 0 && a % (b + 6) == 0 && a % (b + 7) == 0 && a % (b + 8) == 0 && a % (b + 9) == 0 && a % (b + 10) == 0 && a % (b + 11) == 0 && a % (b + 12) == 0 && a % (b + 13) == 0 && a % (b + 14) == 0 && a % (b + 15) == 0 && a % (b + 16) == 0 && a % (b + 17) == 0 && a % (b + 18) == 0 && a % (b + 19) == 0) {
				System.out.println(a);
			}

		}
	}
}