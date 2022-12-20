package ObjectParameters;

class Test2 {
    int a, b;

    Test2 (int a, int b) {
        this.a = a;
        this.b = b;
    }

    void change(Test2 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
public class CallByReference {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);

        System.out.println("Ob.a and ob.b before call: " + ob.a + " " + ob.b);
        // the actions inside .change() have affected the object used as an argument
        ob.change(ob);

        System.out.println("Ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
