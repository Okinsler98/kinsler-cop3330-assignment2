/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex38.base;

import java.util.Scanner;

public class Solution38 {
    private static final Scanner in = new Scanner(System.in);
    private static String values;

    public static void main(String[] args) {
        FilterValues filter = new FilterValues();

        readInput();

        char evenValues[] = filter.filterEvenNumbers(values.toCharArray());
        String output = generateOutput(evenValues);

        System.out.println(output);

    }

    public static void readInput(){
        System.out.print("Enter a list of numbers, separated by spaces: ");
        values = in.nextLine();
    }

    public static String generateOutput(char evenValues[]){
        String output = "The even numbers are ";
        for (int i = 0; i < evenValues.length; i++){
            output += evenValues[i];
        }
        return output + ".";
    }
}
