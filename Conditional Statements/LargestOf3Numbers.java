import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();

        System.out.println("first number: " + num1 + " second number: " + num2 + " third number: " + num3);

        if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println("Number 1 is largest : ");
        } else if (num2 > num3) {
            System.out.println("Number 2 is largest ");
        } else {
            System.out.println("Number 3 is largest : ");
        }
        sc.close();
    }
}
