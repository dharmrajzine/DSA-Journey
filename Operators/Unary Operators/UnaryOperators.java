
public class UnaryOperators {
    public static void main(String[] args) {

        int num = 10;

        int result = +num;
        System.out.println("The value of result after unary plus is: " + result);

        result = -num;
        System.out.println("The value of result after unary minus is: " + result);

        result = ++num;
        System.out.println("The value of after pre-increment is: " + result);

        result = num++;
        System.out.println("The value of result after post-increment is: " + result);

        result = --num;
        System.out.println("The value of result after pre-decrement is: " + result);

        result = num--;
        System.out.println("The value of result after post-decrement is: " + result);
    }
}
