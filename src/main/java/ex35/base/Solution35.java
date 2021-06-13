/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex35.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution35 {
    private static final Scanner in = new Scanner(System.in);
    public static ArrayList list = new ArrayList();
    private static boolean exitBool = true;
    private static String name;

    public static void main(String[] args) {
        ArrayManager manager = new ArrayManager();

        while (exitBool){
            readInput();
            exitBool = manager.addToArray(list, name);
        }

        String winner = manager.selectRandom(list);
        String output = generateOutput(winner);
        System.out.print(output);
    }

    public static void readInput(){
        System.out.print("Enter a name: ");
        name = in.nextLine();
    }

    public static String generateOutput(String winner){
        return "The winner is... " + winner + ".";
    }
}
