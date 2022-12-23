package RevLectures.Day3InterestCalc;

import java.util.Scanner;

public class Interest {
    /**
     * Ask user for initial balance and annual interest rate, show results
     * @param args
     */
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            // ask user for initial balance and annual interest
            System.out.println("Input balance: ");
            String balanceInput = sc.nextLine();
            // convert inputted string to double
            double balance = Double.parseDouble(balanceInput);

            System.out.println("Input interest rate: ");
            String interestInput = sc.nextLine();
            //convert to double
            double interest = Double.parseDouble(interestInput);

            //perform interest calculation
            double result = calculateBalanceAnnual(balance, interest);

            //show results
            System.out.println("Result: " + result);

        }
    }

    /**
     * add amount received from interest to the og amount
     * @param principal starting balance
     * @param apy interest rate
     * @return final balance after interest
     */
    public static double calculateBalanceAnnual(double principal, double apy){
        return principal + calculateProfit(principal, apy);
    }

    /**
     * 
     * @param principal
     * @param apy
     * @return profit gained from principal * apy
     */
    public static double calculateProfit(double principal, double apy){
        return principal * apy;
    }
}
