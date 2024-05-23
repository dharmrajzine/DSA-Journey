import java.util.Scanner;

public class Area_of_Square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number you want area of square : ");
        int side = sc.nextInt();

        int area = side * side;

        System.out.println("Area of the square is : " + area);

        sc.close();
    }
}
