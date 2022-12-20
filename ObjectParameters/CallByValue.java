package ObjectParameters;

class Test {
   void noChange(int i, int j) {
       i = i + j;
       j = -j;
   }
}
public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;
        // when a and b are primitive types, the call by value way of passing arguments is used,
        // a copy of the argument is passed into the method, and the original value is not changed
        System.out.println("a and b before call: " + a + " " + b);
        ob.noChange(a, b);
        System.out.println("a and b after call: " + a + " " + b);
    }
}
