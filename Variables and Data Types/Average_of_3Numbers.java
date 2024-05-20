import java.util.Scanner;

public class Average_of_3Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int A = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int B = sc.nextInt();
        System.out.println("Enter third Number: ");
        int C = sc.nextInt();

        int average = (A + B + C) / 3;

        System.out.println("average is: " + average);
    }
}
