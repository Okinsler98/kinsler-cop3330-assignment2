/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex39.base;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Solution39 {
        public static Map<String, String> records = new HashMap<>();
    public static void main(String args[]){


        records.put("John", "Johnson");
        records.put("Tou", "Xiong");
        records.put("Michaela", "Michaelson");
        records.put("Jake", "Jacobson");
        records.put("Jacquelyn", "Jackson");
        records.put("Sally", "Webber");

        System.out.println(records.values());

    }

}

