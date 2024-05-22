
public class RightShiftEx {
    public static void main(String[] args) {

        int number = 8;

        int Ans = number >> 2;

        System.out.println(Ans);

        char hex[] = {
                '0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', 'a', 'b', 'c',
                'd', 'e', 'f'
        };

        byte b = (byte) 0xf1;

        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}
