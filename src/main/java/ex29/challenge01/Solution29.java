/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex29.challenge01;

import java.util.Scanner;

public class Solution29 {
    private static String returnRate = new String();

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Solution29 solution = new Solution29();

        readUserInput();

        int years = calculateReturn(Integer.parseInt(returnRate));
        String output = generateOutput(years);

        System.out.println(output);
    }

    public static void readUserInput() {
            System.out.print("What is the rate of return? ");
            returnRate = in.next();
            if (checkInputValue(returnRate) == 0){
                System.out.println("Sorry. That's not a valid input.");
                readUserInput();
            } else if (checkInputValue(returnRate) == 1){
                System.out.println("Sorry. \"0\" is not a valid input.");
                readUserInput();
            } else{
                return;
            }
    }

    public static String generateOutput(int years){
        return "It will take " + years + " years to double your initial investment.";
    }

    public static int calculateReturn (int returnRate){
        return 72 / returnRate;
    }

    public static int checkInputValue(String userInput){
        for (int i = 0; i < userInput.length(); i++){
            if (!Character.isDigit(userInput.charAt(i))){
                return 0;
            }
        }
        if (Integer.parseInt(userInput) == 0){
            return 1;
        } else {
            return 2;
        }
    }
}
