package Inheritance;

class TwoDShape2 {
    double width;
    double height;

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

class Triangle2 extends TwoDShape2 {
    private String style;

    // Triangle2 constructor inherits the members of the TwoDShape2 class
    Triangle2(String s, double w, double h) {
        style = s;
        width = w;
        height = h;
    }
    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

public class Shapes2 {
    public static void main(String args[]) {
        Triangle2 t1 = new Triangle2("filled", 4.0, 4.0);
        Triangle2 t2 = new Triangle2("outlines", 8.0, 12.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
