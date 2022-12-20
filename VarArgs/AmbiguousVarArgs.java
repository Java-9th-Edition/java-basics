package VarArgs;

public class AmbiguousVarArgs {
    static void vaTest(int ...v) {
        // ...
    }

    static void vaTest(boolean ...v) {
        // ...
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3); // OK
        vaTest(true, false, false); // OK
        // vaTest(); // Error: Ambiguous
    }
}
