/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex27.base;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in);

    private static String fName;
    private static String lName;
    private static String zip;
    private static String id;

    public static void main(String[] args){
        readUserInput();

        InputValidator validator = new InputValidator();
        boolean fNameBool = validator.validateInput(fName, 1);
        boolean lNameBool = validator.validateInput(lName, 1);
        boolean zipBool = validator.validateInput(zip, 2);
        boolean idBool = validator.validateInput(id, 3);

        String output = generateOutput(fNameBool, lNameBool, zipBool, idBool);

        System.out.println(output);
    }

    public static void readUserInput() {
        System.out.print("Enter the first name: ");
        fName = in.next();
        System.out.print("Enter the last name: ");
        lName = in.next();
        System.out.print("Enter the ZIP code: ");
        zip = in.next();
        System.out.print("Enter the employee ID: ");
        id = in.next();
    }

    public static String generateOutput(boolean fNameBool, boolean lNameBool, boolean zipBool, boolean idBool){
        String output = null;
        if(!fNameBool){
            output = "The first name must be at least 2 characters long.\n";
            if (fName == null){
                output = output + "The first name must be filled in.\n";
            }
        }
        if (!lNameBool){
            output = output + "The last name must be at least 2 characters long.\n";
            if (lName == null){
                output = output + "The last name must be filled in.\n";
            }
        }
        if (!idBool){
            output = output + "The employee ID must be in the format of AA-1234.\n";
            if (id == null){
                output = output + "The employee ID must be filled in.\n";
            }
        }
        if (!zipBool){
            output = output + "The zipcode must be a 5 digit number.\n";
            if (zip == null){
                output = output + "The zipcode must be filled in.\n";
            }
        }
        if (output == null){
            output = "There were no errors found.";
        }
        return output;
    }
}
