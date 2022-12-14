package ProgramControlStatements;

public class ContinueLabelLoop {
    public static void main(String[] arge) {
        outerLoop: for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i + ", Inner loop: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5) continue outerLoop; // continue outer loop
                // think of this as a break statement that breaks our of the inner loop
                System.out.print(j);
            }
        }
    }
}
