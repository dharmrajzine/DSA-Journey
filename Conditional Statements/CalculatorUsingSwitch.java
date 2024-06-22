import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {

        System.out.println("hey hi, use the calculator to reduce your time to calculate ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.println("Select Operator \n + - * / %");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Wrong Operator");
                break;
        }
        sc.close();
    }
}
