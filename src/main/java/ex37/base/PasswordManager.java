/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex37.base;

import java.util.ArrayList;
import java.util.Random;

public class PasswordManager {
    public static ArrayList lettersList = new ArrayList();
    public static ArrayList specialCharList = new ArrayList();
    public static ArrayList numbersList = new ArrayList();

    Random rand = new Random();

    public String generatePassword(int minLength, int specialChar, int numbers){
        addToList(lettersList, "abcdefghijklmnopqrstuvwxyz");
        addToList(specialCharList,"!@#$%&*");
        addToList(numbersList, "123456789");

        int letters = 0;
        int selector = 0;
        int listSelector = 0;
        String output = new String();

        while (true){
            letters++;
            if ((letters >= (specialChar + numbers)) && ((letters + specialChar + numbers) >= minLength)){
                break;
            }
        }

        while (true) {
            selector = rand.nextInt(3);
            switch (selector){
                case 0 :
                    if (letters > 0){
                        listSelector = rand.nextInt(lettersList.size());
                        output += lettersList.get(listSelector);
                        letters--;
                    }
                    break;
                case 1 :
                    if (specialChar > 0){
                        listSelector = rand.nextInt(specialCharList.size());
                        output += specialCharList.get(listSelector);
                        specialChar--;
                    }
                    break;
                case 2 :
                    if (numbers > 0){
                        listSelector = rand.nextInt(numbersList.size());
                        output += numbersList.get(listSelector);
                        numbers--;
                    }
                    break;
            }
            if (letters == 0 && numbers == 0 && specialChar == 0){
                return output;
            }
        }
    }

    public void addToList(ArrayList list, String values){
        for (int i = 0; i < values.length(); i++){
            list.add(values.charAt(i));
        }
    }
}
