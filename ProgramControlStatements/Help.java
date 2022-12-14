package ProgramControlStatements;

public class Help {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Help on: ");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println("    3. for");
        System.out.println("    4. while");
        System.out.println("    5. do-while");
        System.out.println("    6. break");
        System.out.println("    7. continue");
        System.out.print("Choose one: ");

        char choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("The if: \n");
                System.out.println("if (condition) statement: \n");
                System.out.println("else statement: \n");
                break;
            case '2':
                System.out.println("The traditional switch: \n");
                System.out.println("switch(expression) {");
                System.out.println("    case constant: ");
                System.out.println("        statement sequence");
                System.out.println("        break;");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for: \n");
                System.out.println("for (init; condition; iteration) statement: \n");
                break;
            case '4':
                System.out.println("The while: \n");
                System.out.println("while (condition) statement: \n");
                break;
            case '5':
                System.out.println("The do-while: \n");
                System.out.println("do {");
                System.out.println("    statement: \n");
                System.out.println("} while (condition);");
                break;
            case '6':
                System.out.println("The break: \n");
                System.out.println("break; or break label: \n");
                break;
            case '7':
                System.out.println("The continue: \n");
                System.out.println("continue; or continue label: \n");
                break;
            default:
                System.out.print("Selection not found");
        }
    }
}
