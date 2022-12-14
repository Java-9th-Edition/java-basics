package ProgramControlStatements;

public class KeyIn {
    public static void main(String[] args) throws java.io.IOException {
        // throws java.io.IOException is necessary to handle input errors
        char ch;
        System.out.print("Press a key followed by ENTER: ");
        ch = (char) System.in.read(); // get a char
        System.out.println("Your key is: " + ch);
    }
}
