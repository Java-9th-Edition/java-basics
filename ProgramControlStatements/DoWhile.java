package ProgramControlStatements;

public class DoWhile {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        do {
            System.out.println("Press a key followed by enter: ");
            ch = (char) System.in.read();
        } while (ch != 'q');

    }
}
