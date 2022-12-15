package InputOutput;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    // Asks the user to input a principle
    // Asks the user to input an annual interest rate
    // Asks the user to input a period in years
    // Calculates the monthly mortgage payment
    // Prints the result

    // formula: M = P * (r(1 + r)^n) / ((1 + r)^n - 1)
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        // final means that these constants cannot be changed in the future

        Scanner scanner = new Scanner(System.in);
        float result;

        System.out.println("Enter Principle: ");
        int principle = scanner.nextInt();

        System.out.println("Enter Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Enter Period in Years: ");
        byte periodInYears = scanner.nextByte();
        int numberOfPayments = periodInYears * MONTHS_IN_YEAR;

        double mortgage = principle * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }

}
