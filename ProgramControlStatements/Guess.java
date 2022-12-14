package ProgramControlStatements;

public class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'K';
        do {
            System.out.println("I'm thinking of a letter between A and Z");
            System.out.print("Can you guess it: ");

            // System.in.read() only reads the first character input, if there is more than one character, it needs to be removed otherwise they are also sent to the logic below as input
            // removing the extra characters is done in the do-while loop below
            ch = (char) System.in.read();

            System.out.println("Ch is " + ch);

            // discard any other characters in the input buffer
            do {
                ignore = (char) System.in.read();
                System.out.println("ignored characters: " + ignore);
            } while (ignore != '\n');
            // console input line is buffered - you have to press enter before the characters are sent
            // pressing enter causes a carriage return and a line feed sequence to be generated - '\n' is created twice
            // The input characters would be left in the input buffer
            // This loop continues to read input until the end of the line is reached. If the characters were not discarded the \n would be sent as a guess
            if (ch == answer) {
                System.out.println("** Right **");
            }
            else if (ch < answer) {
                System.out.println("Too Low");
                System.out.println("Try Again! \n");
            }
            else {
                System.out.println("Too High");
                System.out.println("Try Again! \n");

            }

        } while (answer != ch);
    }
}
