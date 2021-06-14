/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex31.base;

import java.util.Scanner;

public class Solution31 {
    private static final Scanner in = new Scanner(System.in);
    private static String restingHR;
    private static String age;

    public static void main(String[] args) {
        KarvonenHeartRate rateCalc = new KarvonenHeartRate();

        readInput();

        rateCalc.displayHR(restingHR, age);
    }

    public static void readInput(){
        boolean controlBool = true;
        while (controlBool){
            System.out.print("Resting Pulse: ");
            restingHR = in.next();
            controlBool = inputControl(restingHR);
        }

        controlBool = true;
        while (controlBool){
            System.out.print("Age: ");
            age = in.next();
            controlBool = inputControl(age);
        }
    }

    public static boolean inputControl(String userInput){
        for (int i = 0; i < userInput.length(); i++){
            if (!Character.isDigit(userInput.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
