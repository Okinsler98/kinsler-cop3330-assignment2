/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex25.base;

public class PasswordStrengthIndicator {
    public int passwordValidator (String password){
        boolean hasLetters = false;
        boolean hasNumbers = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++){
            if (Character.isLetter(password.charAt(i))){
                hasLetters = true;
            }
            if (Character.isDigit(password.charAt(i))){
                hasNumbers = true;
            }
            if (!Character.isLetterOrDigit(password.charAt(i))){
                hasSpecial = true;
            }
        }

        if (password.length() < 8){
            if (!hasLetters){
                return 1;
            } else if (!hasNumbers){
                return 2;
            } else {
                return 0;
            }
        } else if (password.length() >= 8){
            if (hasLetters && hasNumbers){
                if (hasSpecial){
                    return 4;
                }
                return 3;
            }
        }
        return 0;
    }
}
