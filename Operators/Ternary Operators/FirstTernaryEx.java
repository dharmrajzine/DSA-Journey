// Java program to find largest among two numbers using ternary operator

public class FirstTernaryEx {
    public static void main(String[] args) {

        int num1 = 5, num2 = 10, max;

        System.out.println("First num: " + num1);
        System.out.println("Second num: " + num2);

        max = (num1 > num2) ? num1 : num2;

        System.out.println("Maximum is = " + max);
    }
}
