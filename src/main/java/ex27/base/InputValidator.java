/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex27.base;

public class InputValidator {
    //Inputs 1: name    2: zip  3: id
    public boolean validateInput(String input, int inputType){
        boolean output;
        switch (inputType){
            case 1 :
                output = validateName(input);
                break;
            case 2 :
                output = validateZip(input);
                break;
            case 3 :
                output = validateId(input);
                break;
            default:
                output = false;
        }
        return output;
    }

    public boolean validateName(String name){
        if (name.length() < 2){
            return false;
        }
        return true;
    }

    public boolean validateZip(String zip){
        for (int i = 0; i < zip.length(); i++){
            if (!Character.isDigit(zip.charAt(i))){
               return false;
            }
        }
        return true;
    }

    public boolean validateId(String id){
        if (id.length() != 7){
            return false;
        }
        if (!Character.isLetter(id.charAt(0)) && !Character.isLetter(id.charAt(0))){
            return false;
        }
        if (Character.compare(id.charAt(2), '-') != 0){
            return false;
        }
        for (int i = 3; i < 6; i++){
            if (!Character.isDigit(id.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
