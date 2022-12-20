package Static;

class StaticDemo {
    int x; // a normal instance variable
    static int y; // a static variable

    // return the sum of the instance variable x and the static variable y
    int sum() {
        return x + y;
    }
}
public class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        // each object has its own copy of an instance variable
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Of course, ob1.x and ob2.x are independent.");
        System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();

        // each object shares one copy of a static variable
        System.out.println("The static variable y is shared.");
        ob1.y = 19;
        ob2.y = 100;
        System.out.println("Set ob1.y to 19.");
        System.out.println("Set ob2.y to 100.");
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Change StaticDemo.y to 100.");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }
}
