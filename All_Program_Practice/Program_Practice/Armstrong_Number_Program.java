package Program_Practice;

import java.util.Scanner;

public class Armstrong_Number_Program {

	public static int armstrong_number(int num) {
		int result = 0;
		while (num > 0) {
			int digit = num % 10;
			result += digit * digit * digit;
			num /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		num = sc.nextInt();

		int result = armstrong_number(num);
		if (result == num)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");
	}
}
