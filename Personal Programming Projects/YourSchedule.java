// 1-7-2018 @Sameer Kapoor
class YourSchedule {
	public static void main(String[] args) {

		int i, j;

		String course1 = "Honors Geometry";
		String teacher1 = "Mrs. Bowling";
		String course2 = "Honors Biology";
		String teacher2 = "Ms. Owen";
		String course3 = "Art History";
		String teacher3 = "Mrs. Chockshi";
		String course4 = "Economics";
		String teacher4 = "Mr. Crawford";
		String course5 = "English I";
		String teacher5 = "Mr. Kerr";
		String course6 = "French III";
		String teacher6 = "Ms. Bunze";

		System.out.print("+");
		for(i = 0; i < 50; i++)
			System.out.print("-");
		System.out.println("+");

		System.out.println("| 1 |       " + course1 + " |        " + teacher1);
		System.out.println("| 2 |       " + course2 + "  |        " + teacher2);
		System.out.println("| 3 |       " + course3 + "     |        " + teacher3);
		System.out.println("| 4 |       " + course4 + "       |        " + teacher4);
		System.out.println("| 5 |       " + course5 + "       |        " + teacher5);
		System.out.println("| 6 |       " + course6 + "      |        " + teacher6);

		System.out.print("+");
		for(j = 0; j < 50; j++)
			System.out.print("-");
		System.out.println("+");

	}
}
