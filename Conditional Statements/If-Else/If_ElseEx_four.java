// Write a java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise print "positive" or "negative". Add "small" if the absolute value of the number is less than 1 or large if it exceeds 1000000.

import java.util.Scanner;

public class If_ElseEx_four {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input value: ");
        double input = sc.nextDouble();

        if (input > 0) {
            if (input < 1) {
                System.out.println("Positive small number");
            } else if (input > 1000000) {
                System.out.println("positive large number");
            } else {
                System.out.println("positive number");
            }
        } else if (input < 0) {
            if (Math.abs(input) < 1) {
                System.out.println("negative samll number");
            } else if (Math.abs(input) > 1000000) {
                System.out.println("negative large number");
            } else {
                System.out.println("negative number");
            }
        } else {
            System.out.println("zero");
        }
        sc.close();
    }
}
