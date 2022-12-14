package ProgramControlStatements;

public class BreakError {
    // you cannot break to any label that is not defined for an enclosing block
    public static void main(String[] args){
        one: for(int i=0; i<3; i++){
            System.out.print("Pass " + i + ": ");
        }
        for (int j=0; j<100; j++){
            if (j == 10) break one; // WRONG
            System.out.print(j + " ");
        }
    }
}
