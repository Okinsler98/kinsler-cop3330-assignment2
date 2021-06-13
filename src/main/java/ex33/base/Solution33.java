/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex33.base;

import java.util.Scanner;
import java.util.Random;
import java.util.*;


public class Solution33 {
    private static final Scanner in = new Scanner(System.in);

    public static List<String> list=new ArrayList<String>();

    private static String question;

    Random rand = new Random();

    public void main(String[] args) {
        readUserInput();
        addToList(list);

        String output = generateOutput();

        System.out.println(output);
    }


    public void readUserInput() {
        System.out.print("What's your question?\n> ");
        question = in.next();
    }

    public void addToList(List list) {
        list.add("Yes");
        list.add("No");
        list.add("Maybe");
        list.add("Ask again later.");
    }

    public String generateOutput(){
        Random rand = new Random();
        int randVal = rand.nextInt(list.size());

        String output = list.get(randVal);
        return output;
    }
}
