package Program_Practice;

import java.util.Scanner;

public class Check_Factorial {

	public static long factorial(long num) {
		if (num == 0)
			return 1;
		return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		long num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		num = sc.nextLong();

		System.out.println(num + " number factorial is " + factorial(num));

	}
}
