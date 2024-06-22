import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter marks here: ");
        int marks = sc.nextInt();

        String status = marks >= 33 ? "pass":"Fail";

        System.out.println(status);
        sc.close();
    }
}
