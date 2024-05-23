// write a java program that takes three numbers from the user and prints the greatest number.

import java.util.Scanner;

public class If_ElseEx_three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the 3rd number: ");
        int num3 = sc.nextInt();

        // if (num1 > num2) {
        // System.out.println("The greatest :" + num1);
        // } else if (num2 > num3) {
        // System.out.println("The gratest number: " + num2);
        // } else if (num3 > num1) {
        // System.out.println("The greatest number: " + num3);
        // } else {
        // System.out.println("please enter a number");
        // }

        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The greatest: " + num1);

        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The greatest: " + num2);

        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The greatest: " + num3);

        sc.close();
    }
}
