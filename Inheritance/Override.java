package Inheritance;

class P {
    int i, j;
    P(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}


class L extends P {
    int k;
    L(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // this show() method overrides the show() in P
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        L subOb = new L(1, 2, 3);
        subOb.show();
    }
}
