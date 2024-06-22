
public class Example_02 {
    public static void main(String[] args) {
        int day = 5;
        String dayString;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Wedesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                dayString = "Invalid day";
        }
        System.out.println(dayString);
    }
}
