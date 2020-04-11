class HeronsFormula {
	public static double TriangleArea(int a, int b, int c) {
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		return area;
	}
	public static void main(String[] args) {
		double Tri1 = TriangleArea(3, 3, 3);
		double Tri2 = TriangleArea(3, 4, 5);
		double Tri3 = TriangleArea(8, 15, 17);

		System.out.println("A triangle with sides 3, 3, 3 has an area of " + Tri1);
		System.out.println("A triangle with sides 3, 4, 5 has an area of " + Tri2);
		System.out.println("A triangle with sides 8, 15, 17 has an area of " + Tri3);
	}
}