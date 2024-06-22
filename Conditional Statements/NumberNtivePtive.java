import java.util.Scanner;

public class NumberNtivePtive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check +tive or -tive");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }
        sc.close();
    }
}
