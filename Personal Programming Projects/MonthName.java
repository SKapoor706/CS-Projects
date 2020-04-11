class MonthName {
	public static void main(String[] args) {
		System.out.println("Month 1: " + month_name(1));
		System.out.println("Month 2: " + month_name(2));
		System.out.println("Month 3: " + month_name(3));
		System.out.println("Month 4: " + month_name(4));
		System.out.println("Month 5: " + month_name(5));
		System.out.println("Month 6: " + month_name(6));
		System.out.println("Month 7: " + month_name(7));
		System.out.println("Month 8: " + month_name(8));
		System.out.println("Month 9: " + month_name(9));
		System.out.println("Month 10: " + month_name(10));
		System.out.println("Month 11: " + month_name(11));
		System.out.println("Month 12: " + month_name(12));
		System.out.println("Month 43: " + month_name(43));
	}
		public static String month_name(int a) {
			String result;
			String error = "error";
			if (a == 1) {
				result = "January";
				return result;
			}
			else if (a == 2) {
				result = "February";
				return result;
			}
			else if (a == 3) {
				result = "March";
				return result;
			}
			else if (a == 4) {
				result = "April";
				return result;
			}
			else if (a == 5) {
				result = "May";
				return result;
			}
			else if (a == 6) {
				result = "June";
				return result;
			}
			else if (a == 7) {
				result = "July";
				return result;
			}
			else if (a == 8) {
				result = "August";
				return result;
			}
			else if (a == 9) {
				result = "September";
				return result;
			}
			else if (a == 10) {
				result = "October";
				return result;
			}
			else if (a == 11) {
				result = "November";
				return result;
			}
			else if (a == 12) {
				result = "December";
				return result;
			}
			else 
				return error;
			
		}
}