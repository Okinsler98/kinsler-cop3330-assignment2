/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex34.base;

import java.util.ArrayList;
import java.util.List;

public class Solution34 {
    public static List<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        generateList(list);

        String output = generateOutput(list);
        System.out.println(output);

        ListManagement manager = new ListManagement();
        list = manager.removeFromList(list);

        output = generateOutput(list);
        System.out.println(output);
    }


    public static void generateList(List list) {
        list.add("John Smith");
        list.add("Jackie Jackson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");
    }

    public static String generateOutput(List list){
        String output = "There are " + list.size() + " employees:";
        for (int i = 0; i < list.size(); i++){
            output = output + "\n" + list.get(i);
        }
        return output + "\n";
    }
}
