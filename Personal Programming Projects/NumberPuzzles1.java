class NumberPuzzles1 {
	public static void main(String[] args) {
		for (int i = 10; i <= 99; i++) {
			for (int x = 10; x <= 99; x++ ) {
				if (i + x == 60 & i - x == 14) {
					System.out.println(i + ", " + x);
				}
			}
		}
	}
}