/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex28.base;

import java.util.Scanner;

public class Solution28 {

    private static final String values[] = new String[5];

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Solution28 solution = new Solution28();

        readUserInput(5);

        int total = solution.calculateSum(values);
        String output = generateOutput(total);

        System.out.println(output);
    }

    public static void readUserInput(int repeatVal) {
        for (int i = 0; i < repeatVal; i++){
            System.out.print("Enter a number: ");
            values[i] = in.next();
        }
    }

    public static String generateOutput(int total){
        return "The total is " + total + "." ;
    }

    public static int calculateSum (String values[]){
        int sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + Integer.parseInt(values[i]);
        }
        return sum;
    }
}
