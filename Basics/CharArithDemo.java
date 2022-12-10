class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++; // chars can be incremented

        System.out.println("ch is now " + ch);

        ch = 90;  // char can be assigned an integer value but is translated to it's unicode equivalent
        System.out.println("ch is now " + ch);

    }
}