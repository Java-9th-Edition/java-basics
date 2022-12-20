package Strings;

// type inference for local variables
public class VarDemo {
    public static void main(String[] args) {
        // use type inference to determine the type of the variable avg. In this case double is inferred
        var avg = 10.0;
        System.out.println("Value of arg "+ avg );

        // var is not a predefined identifier, it is just a user defined variable name
        int var = 1;
        System.out.println("Value of var: " + var);

        // Var is used as both the type of the declaration and as a variable name in the initializer
        var k = -var;
        System.out.println("Value of K: " + k);
    }
}
