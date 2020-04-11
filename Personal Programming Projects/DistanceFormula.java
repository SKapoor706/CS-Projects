// 2-17-2018 @Sameer Kapoor
class DistanceFormula {
	public static double findDistance(int x1, int y1, int x2, int y2) {
		double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return distance;
	}
	public static void main(String[] args) {
		double d1 = findDistance(-2,1, 1,5);
		System.out.println("(-2, 1) to (1, 5) => " + d1);
	}
}
