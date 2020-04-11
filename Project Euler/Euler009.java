// 4-6-2018 @Sameer Kapoor
class Euler009 {
	public static void main(String[] args) {
		int a, b = 2, c = 3;
		for (a = 1; a < 500; a++) {
			for (b = a; b < 500; b++) {
				for (c = b; c < 500; c++) {
					if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && (a + b + c) == 1000) {
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
		}
	}
}
