package OOP;


class myClass {
    int x;
    myClass(int i) {
        x = 10;
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        myClass t1 = new myClass(10);
        myClass t2 = new myClass(20);
        System.out.println(t1.x + " " + t2.x);
    }
}
