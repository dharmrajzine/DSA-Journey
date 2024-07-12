package Pattern02;

public class InvertedRotetedHalfPyaramid {

    public static void inverted_roteted_half_pyramid(int n) {
// outer loop
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_roteted_half_pyramid(6);
    }
}
