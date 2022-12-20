package Overloading;

class Summation {
    int sum;

    Summation(int sum) {
        sum = 0;
        for (int i = 1; i <= sum; i++) {
            this.sum += i;
        }
    }

    // construct from another object
    Summation(Summation ob) {
        sum = ob.sum;
    }
}
public class SumDemo {
    public static void main(String[] args) {
        Summation s1 = new Summation(5);
        // instead of recalculating the summation, we just reference the s1 object
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}
