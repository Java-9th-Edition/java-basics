package Static;
class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    // this code is executed when the class is loaded
    static {
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }
}
public class StaticBlockDemo {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock();
        System.out.println("Square root of 2 is " + StaticBlock.rootOf2);
        System.out.println("Square root of 3 is " + StaticBlock.rootOf3);
    }
}
