package Static;

class StaticMeth {
    static int val = 1024;

    static int valDiv2() {
        return val / 2;
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        // notice that there is no object created from StaticMeth, to access the valDiv2 method
        System.out.println("StaticMath.val: " + StaticMeth.val);
        System.out.println("StaticMath.valDiv2(): " + StaticMeth.valDiv2());
        StaticMeth.val = 4;
        System.out.println("StaticMath.val: " + StaticMeth.val);
        System.out.println("StaticMath.valDiv2(): " + StaticMeth.valDiv2());
    }
}
