class Euler002 {
	public static void main(String[] args) {
		int f = 0, g = 1, sum = 0;
		int[] fibArray = new int[34];

		for (int i = 0; i < 34; i++) {
			fibArray[i] = f;
			f = f + g; 
			g = f - g; 
		}

		for (int x : fibArray) {
			if (x % 2 == 0) {
				sum += x;
			}
		}
		System.out.print(sum);
	}

}

