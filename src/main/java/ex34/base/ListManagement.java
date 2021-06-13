/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex34.base;

import java.util.Scanner;
import java.util.List;

public class ListManagement {
    private static final Scanner in = new Scanner(System.in);
    private static String name;

    public List removeFromList(List list){
        System.out.print("Enter an employee name to remove: ");
        name = in.nextLine();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(name)){
                list.remove(i);
                System.out.print("\n");
            }
        }
        return list;
    }
}
