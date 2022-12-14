package BitwiseOperators;

class ShowBits2 {
    int numBits;
    ShowBits2(int n) {
        numBits = n;
    }

    void show(long val) {
        long mask = 1;
        // left-shift a 1 into the proper position
        mask <<= numBits - 1;
        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) {
                System.out.print("1");
            }
            else {
                System.out.print("0");
            }
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits2 b = new ShowBits2(8);
        ShowBits2 i = new ShowBits2(32);
        ShowBits2 li = new ShowBits2(64);
        System.out.println("123 in binary: ");
        b.show(123);
        System.out.println("\n87987 in binary: ");
        i.show(87987);
        System.out.println("\n237658768 in binary: ");
        li.show(237658768);
        // you can also show low-order bits of any integer
        System.out.println("\nLow order 8 bits of 87987 in binary: ");
        b.show(87987);
    }
}
