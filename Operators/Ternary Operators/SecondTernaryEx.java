
public class SecondTernaryEx {
    public static void main(String[] args) {

        int num1 = 15, num2 = 10, res;

        System.out.println("First num: " + num1);
        System.out.println("Second num: " + num2);

        res = (num1 > num2) ? (num1 + num2) : (num1 - num2);

        System.out.println("Result = " + res);
    }
}
