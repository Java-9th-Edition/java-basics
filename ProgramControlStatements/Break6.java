package ProgramControlStatements;

public class Break6 {
    public static void main(String[] args) {
        int x = 0, y =0;
        // label is before for statement
        stop1: for(x = 0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();
        // label is just before {
        for(x = 0; x < 5; x++)
            // when the break executes, it only breaks out of the inner label stop2 and transfers control back to the outer loop
            stop2: {
                for(y = 0; y < 5; y++) {
                    if(y == 2) break stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }
    }
}