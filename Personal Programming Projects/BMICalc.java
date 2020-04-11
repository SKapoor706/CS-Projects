import java.util.Scanner;
class BMICalc {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double heightF, weightLB, heightI, heightM, weightKG, BMIMeasure;

		System.out.println("Your height (feet only): ");
		heightF = keyboard.nextDouble();
		System.out.println("Your height (inches): ");
		heightI = keyboard.nextDouble();
		System.out.println("Your weight in pounds: ");
		weightLB = keyboard.nextDouble();

		heightM = heightF * .3048;
		heightI = heightI * .0254;
		heightM = heightM + heightI;

		weightKG = weightLB * .453592;

		BMIMeasure = weightKG / heightM;

		System.out.println("Your BMI is " + BMIMeasure);

	}
}