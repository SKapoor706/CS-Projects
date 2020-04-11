// 1-20-2018 @Sameer Kapoor
import java.util.Random;
class DiceDoubles {
	public static void main(String[] args) {
		Random r = new Random();

		int DiceNum1 = 1 + r.nextInt(6);
		int DiceNum2 = 1 + r.nextInt(6);

		System.out.println("HERE COMES THE DICE!\n");

		while (DiceNum1 != DiceNum2) {
			DiceNum1 = 1 + r.nextInt(6);
			DiceNum2 = 1 + r.nextInt(6);

			System.out.println("Role #1: " + DiceNum1);
			System.out.println("Role #2: " + DiceNum2);
			System.out.println("The total is " + (DiceNum1 + DiceNum2) + "!");
		}

	}
}
