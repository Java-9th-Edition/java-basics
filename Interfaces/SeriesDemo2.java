package Interfaces;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        // reference variable of the interface Series
        // interface reference variable can refer to any object that implements Series interface
        Series ob;


        for (int i = 0; i < 5; i++) {
            ob = twoOb;  // twoOb using the ob reference
            System.out.println("Next ByTwos value is " + ob.getNext());

            ob = threeOb;  // threeOb using the ob reference
            System.out.println("Next ByThrees value is " + ob.getNext());
        }
    }
}
