// 4-3-2018 @Sameer Kapoor
class Euler004 {
	public static void main(String[] args) {
		for (int x = 100; x < 999; x++) {
			for (int y = 100; y < 999; y++) {
				int product = x * y;
				String productString = Integer.toString(product);

				if(isPalindrome(productString)) {
					System.out.print(x + ", " + y + " , " + productString);
					System.out.println('\n');
				}
			}

		}
	}

	public static boolean isPalindrome(String p) {
		String reverse = new StringBuffer(p).reverse().toString();

		if (reverse.equals(p)) {
			return true;
		}
		return false;
	}
}
