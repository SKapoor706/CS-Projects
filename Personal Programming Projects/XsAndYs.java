// 2-3-2018 @Sameer Kapoor
class XsAndYs {
	public static void main(String[] args) {
		System.out.println("x          y\n-------------");

		for(double x = -10.0; x <= 10.0; x = x + .5) {
			System.out.print(x + " ");
			double y = Math.pow(x, 2);
			System.out.println("\t" + y);
			System.out.println();

		}
	}
}
