package InputOutput;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // specify where your input is coming from, System.in is from the terminal
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        // read the next byte from the terminal - note that the value returned is of type byte. If your input a data type not byte it will return error
        // trim() method removed the white space from the beginning and end of the string

        System.out.println("Your name is: " + name);
    }
}
