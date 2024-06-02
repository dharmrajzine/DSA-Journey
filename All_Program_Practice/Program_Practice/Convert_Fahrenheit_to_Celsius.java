package Program_Practice;

import java.util.Scanner;

public class Convert_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		float temperature;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Fahrenheit: ");
		temperature = sc.nextInt();

		temperature = ((temperature - 32) * 5) / 9;
		System.out.println("Temperature in Celsius = " + temperature);
	}
}
