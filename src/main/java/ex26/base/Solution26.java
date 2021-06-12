/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex26.base;

import java.util.Scanner;

public class Solution26 {
    private static final Scanner in = new Scanner(System.in);

    private static String balance;
    private static String apr;
    private static String monthlyPayment;

    public static void main(String[] args) {
        readUserInput();

        PaymentCalculator pass = new PaymentCalculator();
        String result = pass.calculateMonthsUntilPaidOff(balance, apr, monthlyPayment);

        String output = generateOutput(result);

        System.out.println(output);
    }


    public static void readUserInput() {
        System.out.print("What is your balance? ");
        balance = in.next();
        System.out.print("What is the APR on the card (as a percent)? ");
        apr = in.next();
        System.out.print("What is the monthly payment you can make? ");
        monthlyPayment = in.next();
    }

    public static String generateOutput(String months){
        return "It will take you " + months + " months to pay off this card.";
    }
}
