package ArraysAndBitwise;

public class ForEach {
    public static void main(String[] args) {
        int[] nums = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
        int sum = 0;

        for (int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
            if (x == 18) {
                break;
            }
        }

        System.out.println("Summation: " + sum);
    }
}
