/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex25.base;

import java.util.Scanner;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);

    private static String password;

    public static void main(String[] args) {
        readUserInput();

        PasswordStrengthIndicator pass = new PasswordStrengthIndicator();
        int result = pass.passwordValidator(password);

        String output = generateOutput(result);

        System.out.println(output);
    }


    public static void readUserInput() {
        System.out.println("Enter a password to determine its strength: ");
        password = in.next();
    }

    public static String generateOutput(int passStrength){
        switch (passStrength){
            case 1:
               return "The password \'" + password + "\' is a very weak password";
            case 2:
                return "The password \'" + password + "\' is a weak password";
            case 3:
                return "The password \'" + password + "\' is a strong password";
            case 4:
                return "The password \'" + password + "\' is a very strong password";
            default:
                return "The password \'" + password + "\' is a weak password";
        }
    }
}