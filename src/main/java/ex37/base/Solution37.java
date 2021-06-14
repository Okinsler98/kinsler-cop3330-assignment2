/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex37.base;

import java.util.Scanner;

public class Solution37 {
    private static final Scanner in = new Scanner(System.in);
    private static String minLength;
    private static String specialChar;
    private static String numbers;

    public static void main(String[] args) {
        PasswordManager manager = new PasswordManager();

        readInput();

        String password = manager.generatePassword(Integer.parseInt(minLength), Integer.parseInt(specialChar), Integer.parseInt(numbers));
        String output = generateOutput(password);

        System.out.println(output);

    }

    public static void readInput(){
        System.out.print("What's the minimum length? ");
        minLength = in.nextLine();
        System.out.print("How many special characters? ");
        specialChar = in.nextLine();
        System.out.print("How many numbers? ");
        numbers = in.nextLine();
    }

    public static String generateOutput(String password){
        String output = "Your password is " + password;
        return output;
    }
}
