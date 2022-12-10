package DataTypesAndOperators;

public class ShortCircuitOperators {
    public static void main(String[] args){
        int n, d, q;
        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0){
            System.out.println(d + " is a factor of " + n);
        }
        d = 0;
        // since we set d to zero, the short-circuit and prevents a divide by zero error by not evaluating the second operand
        if (d != 0 && (n % d) == 0){
            System.out.println(d + " is a factor of " + n);
        }

        // without a short-circuit operator will return a divide by zero error
        if (d != 0 & (n % d) == 0){
            System.out.println(d + " is a factor of " + n);
        }
    }
}
