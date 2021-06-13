/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex30.base;

import java.util.Scanner;

public class Solution30 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        String table[] = createMultipleTable(3);
        String output = generateOutput(table);

        System.out.println(output);
    }

    public static String generateOutput(String table[]){
        String output = "";
        for (int i = 0; i < table.length; i++){
            switch (table[i].length()){
                case 1 :
                    output = output + "   " + table[i];
                    break;
                case 2 :
                    output = output + "  " + table[i];
                    break;
                case 3 :
                    output = output + " " + table[i];
                    break;
                default :
                    output = output + " " + table[i];
                    break;
            }
            if ((i + 1) % Math.sqrt(table.length) == 0){
                output = output + "\n";
            }
        }
        return output;
    }

    public static String createMultipleTable (int maxValue)[]{
        String table[] = new String[maxValue * maxValue];
        int currTableVal = 0;

        for (int i = 1; i < maxValue + 1; i++){
            for (int j = 1; j < maxValue + 1; j++){
                table[currTableVal] = Integer.toString(i * j);
                currTableVal++;
            }
        }
        return table;
    }
}
