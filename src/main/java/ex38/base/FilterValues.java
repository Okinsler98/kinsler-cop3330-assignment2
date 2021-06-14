/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex38.base;

public class FilterValues {
    public char filterEvenNumbers(char input[])[]{
            String valueHolder = new String();
            int arrayCounter = 0;
            for (int i = 0; i < input.length; i++){
                if ((input[i] % 2) == 0){
                    valueHolder += input[i];
                    arrayCounter++;
                }
            }

            char output[] = new char[arrayCounter];
            for (int i = 0; i < valueHolder.length(); i++){
                output[i] = valueHolder.charAt(i);
            }
            return output;
    }
}
