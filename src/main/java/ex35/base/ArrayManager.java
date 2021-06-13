/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex35.base;

import java.util.ArrayList;
import java.util.Random;

public class ArrayManager {
    public boolean addToArray(ArrayList array, String name){
        if (name.isBlank()){
            return false;
        }
        array.add(name);
        return true;
    }

    public String selectRandom(ArrayList array){
        Random rand = new Random();
        int selector = rand.nextInt(array.size());
        return (String) array.get(selector);
    }
}
