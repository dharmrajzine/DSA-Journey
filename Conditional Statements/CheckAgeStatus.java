
public class CheckAgeStatus {
    public static void main(String[] args) {
        int age = 19;

        if (age >= 18) {
            System.out.println("Adult: you can drive! or you can vote!");
        } else if (age > 13 && age < 18) {
            System.out.println("Teenager!");
        } else {
            System.out.println("not Adult");
        }
    }
}
