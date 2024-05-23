//write a java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class If_ElseEx_one {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check +ve or -ve: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("number is positive");
        } else if (number < 0) {
            System.out.println("number i negative");
        } else {
            System.out.println("number is 0");
        }
        sc.close();
    }
}
