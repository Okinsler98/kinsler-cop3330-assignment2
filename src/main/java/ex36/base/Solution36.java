/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex36.base;

import java.util.Scanner;
import java.util.ArrayList;


public class Solution36 {
    private static final Scanner in = new Scanner(System.in);
    public static ArrayList list = new ArrayList();
    private static boolean exitBool = true;
    private static String number;

    public static void main(String[] args) {
        ListCalculations calculations = new ListCalculations();

        while (exitBool){
            exitBool = readInput();
            if (exitBool){
                list.add(number);
            }
        }

        double average = calculations.avarage(list);
        double max = calculations.max(list);
        double min = calculations.min(list);
        double std = calculations.std(list);

        String output = generateOutput(average, max, min, std);
        System.out.print(output);
    }

    public static boolean readInput(){
        System.out.print("Enter a number: ");
        number = in.nextLine();
        if (number.equalsIgnoreCase("done")){
            return false;
        }
        for (int i = 0; i < number.length(); i++){
            if (!Character.isDigit(number.charAt(i))){
                return readInput();
            }
        }
        return true;
    }

    public static String generateOutput(double average, double max, double min, double std){
        String output = new String();
        output = "Numbers: ";
        for (int i = 0; i < list.size(); i++){
            output += (String) list.get(i);
            if (i < list.size() - 1){
                output += ", ";
            }
        }
        output += "\nThe average is " + average + "\n";
        output += "The minimum is " + min + "\n";
        output += "The maximum is " + max + "\n";
        output += "The standard deviation is " + std + "\n";
        return output;
    }
}
