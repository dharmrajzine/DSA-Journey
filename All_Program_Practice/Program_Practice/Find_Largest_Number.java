package Program_Practice;

import java.util.Scanner;

public class Find_Largest_Number {

	public static void main(String[] args) {
		int x, y, z;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers : ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		if (x > y && x > z)
			System.out.println("First number is greatest.");
		else if (y > x && y > z)
			System.out.println("Second number is greatest.");
		else
			System.out.println("Third number is greatest.");

	}
}
