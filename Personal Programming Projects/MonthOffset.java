class MonthOffset {
	public static void main(String[] args) {
		System.out.println("Offset for month 1: " + returnMonth(1));
		System.out.println("Offset for month 2: " + returnMonth(2));
		System.out.println("Offset for month 3: " + returnMonth(3));
		System.out.println("Offset for month 4: " + returnMonth(4));
		System.out.println("Offset for month 5: " + returnMonth(5));
		System.out.println("Offset for month 6: " + returnMonth(6));
		System.out.println("Offset for month 7: " + returnMonth(7));
		System.out.println("Offset for month 8: " + returnMonth(8));
		System.out.println("Offset for month 9: " + returnMonth(9));
		System.out.println("Offset for month 10: " + returnMonth(10));
		System.out.println("Offset for month 12: " + returnMonth(11));
		System.out.println("Offset for month 12: " + returnMonth(12));
		System.out.println("Offset for month 43: " + returnMonth(43));
	}
	public static int returnMonth(int a) {
		int month;
		if (a == 1) {
			month = 1;
		}
		else if (a == 2) {
			month = 4;
		}
		else if (a == 3) {
			month = 4;
		}
		else if (a == 4) {
			month = 0;
		}
		else if (a == 5) {
			month = 2;
		}
		else if (a == 6) {
			month = 5;
		}
		else if (a == 7) {
			month = 0;
		}
		else if (a == 8) {
			month = 3;
		}
		else if (a == 9) {
			month = 6;
		}
		else if (a == 10) {
			month = 1;
		}
		else if (a == 11) {
			month = 4;
		}
		else if (a == 12) {
			month = 6;
		}
		else {
			month = -1;
		}
		return month;
	}
}


	


