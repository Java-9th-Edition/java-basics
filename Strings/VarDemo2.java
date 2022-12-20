package Strings;

// type inference in user-defined classes
class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    };

    int getI() {
        return i;
    }

    void setI(int k) {
        if (k >= 0) {
            i = k;
        }
    }
}

public class VarDemo2 {
    public static void main(String[] args) {
        var myClass = new MyClass(10);

        System.out.println("Value of i in myClass is " + myClass.getI());

        myClass.setI(19);

        System.out.println("Value of i in myClass is now " + myClass.getI());

    }
}
