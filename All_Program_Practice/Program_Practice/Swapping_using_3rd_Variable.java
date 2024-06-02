package Program_Practice;

import java.util.Scanner;

public class Swapping_using_3rd_Variable {

	public static void main(String[] args) {

		int x, y, temp;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x and y ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.println("Before Swapping : \n X " + x + "\n Y " + y);

		temp = x;
		x = y;
		y = temp;
		System.out.println("Before Swapping : \n X " + x + "\n Y " + y);

	}
}
