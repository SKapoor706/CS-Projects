class GettingIndividualDigits {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int x = 0; x <= 9; x++) {
				int answer = i + x; 
				System.out.println(i + "" + x + ", " + i + " + " + x + " = " + answer);
			}
		}
	}
}