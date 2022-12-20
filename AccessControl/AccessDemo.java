package AccessControl;

class MyClass {
    private int alpha; // private access
    public int beta; // public access
    int gamma; // default access

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // you cannot access alpha like this:
        // ob.alpha = 10; // Error! alpha is private

        // these are OK because beta and gamma are public
        ob.beta = 88;
        ob.gamma = 99;
    }
}
