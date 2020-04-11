import java.util.Random;
class Dice {
	public static void main(String[] args) {
		Random r = new Random();
		int diceNum1 = 1 + r.nextInt(6);
		int diceNum2 = 1 + r.nextInt(6);

		System.out.println("HERE COMES THE DICE!\n");
		System.out.println("Roll #1: " + diceNum1);
		System.out.println("Roll #2: " + diceNum2);

		System.out.println("The total is " + (diceNum1 + diceNum2));
	}
}