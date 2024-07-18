package Pattern02;

public class HallowPattern {

    public static void hallow_Reactangle(int n) { // int totRows, int totCols
        // for (int i = 1; i <= totRows; i++) {
        // for (int j = 1; j <= totCols; j++) {
        // if (i == 1 || i == totRows || j == 1 || j == totCols) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.err.println();
        // }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hallow_Reactangle(6);
    }
}
