package Inheritance;

class TwoDShape4 {
    private double width;
    private double height;

    TwoDShape4(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

class Triangle4 extends TwoDShape4 {
    private String style;

    // Triangle2 constructor inherits the members of the TwoDShape2 class
    Triangle4(String s, double w, double h) {
        super(w, h);  // call the superclass constructor
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

public class Shapes4 {
    public static void main(String args[]) {
        Triangle4 t1 = new Triangle4("filled", 4.0, 4.0);
        Triangle4 t2 = new Triangle4("outlines", 8.0, 12.0);

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
