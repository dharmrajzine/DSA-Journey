package Arrays_Part_1;

import java.util.Scanner;

public class Input_Array {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Math: " + marks[2]);

        marks[2] = marks[2] + 1;
        System.out.println("Updated math marks: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage " + percentage + "%");


        System.out.println(marks.length);
    }
}
