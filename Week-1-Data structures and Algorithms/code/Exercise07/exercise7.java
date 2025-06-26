// Exercise 7: Financial Forecasting

import java.util.Scanner;

public class exercise7 {
    // recursive calculation of future value
    public static double forecastValue(double principal, double rate, int periods) {
        if (periods == 0) {
            return principal;
        }
        double updatedValue = principal * (1 + rate);
        return forecastValue(updatedValue, rate, periods - 1);
    }

    // iterative calculation of future value
    public static double forecastValueIterative(double principal, double rate, int periods) {
        double result = principal;
        for (int i = 0; i < periods; i++) {
            result *= (1 + rate);
        }
        return result;
    }

    // calculate total interest earned
    public static double calculateTotalInterest(double principal, double finalAmount) {
        return finalAmount - principal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.print("Enter initial investment amount: ");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter annual increase rate (as percentage, e.g., 7 for 7%): ");
        double yearlyIncrease = scanner.nextDouble() / 100.0;

        System.out.print("Enter number of years: ");
        int yearsAhead = scanner.nextInt();

        // calculate projected amount and total interest
        double projectedAmountRecursive = forecastValue(initialInvestment, yearlyIncrease, yearsAhead);
        double projectedAmountIterative = forecastValueIterative(initialInvestment, yearlyIncrease, yearsAhead);
        double totalInterest = calculateTotalInterest(initialInvestment, projectedAmountRecursive);

        // print results
        System.out.println("Initial investment: $" + initialInvestment);
        System.out.println("Annual increase: " + (yearlyIncrease * 100) + "%");
        System.out.println("Years: " + yearsAhead);
        System.out.println("Projected value after " + yearsAhead + " years (recursive): $" + Math.round(projectedAmountRecursive));
        System.out.println("Projected value after " + yearsAhead + " years (iterative): $" + Math.round(projectedAmountIterative));
        System.out.println("Total interest earned: $" + Math.round(totalInterest));

        // object closed
        scanner.close();
    }
}