// 2-17-2018 @Sameer Kapoor
import java.util.Scanner;
class AreaCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Shape Area Calculator");
		boolean cond = true;
		while (cond) {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("1) Triangle\n2) Rectangle\n3) Square\n4) Circle\n5) Quit");
			System.out.print("Which shape: ");
			int shape = keyboard.nextInt();

			if (shape == 1) {
				System.out.print("Base: ");
				int b = keyboard.nextInt();
				System.out.print("Height: ");
				int h = keyboard.nextInt();
				System.out.println("The area is " + areaTriangle(b, h));
				System.out.println("\n");
			}
			else if (shape == 2) {
				System.out.print("Length: ");
				int l = keyboard.nextInt();
				System.out.print("Width: ");
				int w = keyboard.nextInt();
				System.out.println("The area is " + areaRectangle(l, w));
			}
			else if (shape == 3) {
				System.out.print("Side length: ");
				int s = keyboard.nextInt();
				System.out.println("The area is " + areaSqaure(s));
			}
			else if (shape == 4) {
				System.out.print("Radius: ");
				int r = keyboard.nextInt();
				System.out.println("The area is " + areaCircle(r));
			}
			else if (shape == 5) {
				System.out.println("Goodbye.");
				cond = false;
			}	

		}
	}
		
	public static double areaCircle(int radius) {
		double area = Math.PI * (radius * radius);
		return area;
	}
	public static double areaTriangle(int base, int height) {
		double area = .5 * base * height;
		return area;
	}
	public static double areaSqaure(int side) {
		double area = side * side;
		return area;
	}
	public static double areaRectangle(int length, int width) {
		double area = length * width;
		return area;
	}
}
