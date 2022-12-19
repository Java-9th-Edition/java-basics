package BitwiseOperators;

public class UpperCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10 ; i ++) {
            ch = (char) ('a' + i);
            System.out.print(ch);
            System.out.print((int)ch);

            ch = (char) ((int) ch & 65503);
            // 65503 in binary is represented as 1111 1111 1101 1111
            // therefore only the 6th bit will be turned off

            System.out.print(ch + " ");
        }
    }
}
