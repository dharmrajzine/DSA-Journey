package Loopss;

import java.util.Scanner;

public class PrintOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number to print N numbers");
        int number = sc.nextInt();
        int counter=1;

        while (counter <= number) {
            System.out.println(counter + " ");
            counter++;
        }

        sc.close();
    }
}
