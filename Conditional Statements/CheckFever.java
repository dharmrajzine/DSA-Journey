import java.util.Scanner;

public class CheckFever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your temperature to check you have fever or not");
        double temperature = sc.nextDouble();

        if (temperature > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
        sc.close();
    }
}
