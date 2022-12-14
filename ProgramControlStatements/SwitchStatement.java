package ProgramControlStatements;

public class SwitchStatement {
    public static void main(String[] args) {
        int i;

        for (i=0; i < 4; i++){
            switch(i) {
                case 0:
                    System.out.println("I is 0");
                    break;
                case 1:
                    System.out.println("I is 1");
                    break;
                case 2:
                    System.out.println("I is 2");
                    break;
                default:
                    System.out.println("I is 3 or more");
            }
        }
    }
}
