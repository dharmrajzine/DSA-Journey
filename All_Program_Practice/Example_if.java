package All_Program_Practice;

public class Example_if {
	public static void main(String[] args) {
		int num1, num2;
		num1 = 10;
		num2 = 20;
		if (num1 < num2)
			System.out.println("x is less than y");
		num1 = num1 * 2;
		if (num1 == num2)
			System.out.println("x now equal to y");
		num1 = num1 * 2;
		if (num1 > num2)
			System.out.println("x now greater than y");
		// this won't display anything
		if (num1 == num2)
			System.out.println("you won't see this");
	}

}
