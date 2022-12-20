package Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        int i;

        for (i=0; i<10; i++) {
            numbers[i] = i;
        }

        for (i=0; i<10; i++) {
            System.out.println("This is numbers[" + i + "]: " + numbers[i]);
        }
    }
}
