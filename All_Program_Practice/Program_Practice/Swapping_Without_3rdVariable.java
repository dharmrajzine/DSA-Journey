package Program_Practice;

public class Swapping_Without_3rdVariable {

	public static void main(String[] args) {

		int x = 100, y = 200;
		System.out.println("Before swapping: X : " + x + " Y " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping: X : " + x + " Y " + y);

	}
}
