// 2-25-2018 @Sameer Kapoor
class ArmstrongNumbers {
	public static void main(String[] args) {
		for (int h = 1; h <= 9; h++) {
			for (int t = 0; t <= 9; t++) {
				for (int o = 0; o <= 9; o++) {
					int num = (h * 100) + (t * 10) + o;
					if (((int) Math.pow(h, 3)) + (int) Math.pow(t, 3) + (int) Math.pow(o, 3) == num) {
						System.out.println(num);
					}
				}
			}
		}
	}
}
