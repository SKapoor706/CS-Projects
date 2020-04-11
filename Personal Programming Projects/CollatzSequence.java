// 1-28-2018 @Sameer Kapoor
import java.util.Scanner;
class CollatzSequence {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int max, StartingNum, steps = 0;

		System.out.print("Starting Number: ");
		StartingNum = keyboard.nextInt();
		max = StartingNum;
		System.out.print(StartingNum + "\t");

		while (StartingNum != 1) {
			if (StartingNum % 2 == 0) {
			StartingNum = StartingNum / 2;
			System.out.print(StartingNum + "\t");
			steps++;

				if (StartingNum > max)
					max = StartingNum;
			}
			else {
				StartingNum = (StartingNum * 3) + 1;
				System.out.print(StartingNum + "\t");
				steps++;

				if (StartingNum > max)
					max = StartingNum;
			}
		}

		System.out.println("\n\nTerminated after " + steps + " steps. The largest value was " + max + ".");
	}
}
