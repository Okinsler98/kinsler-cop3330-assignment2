/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex32.base;

import java.util.Scanner;

public class Solution32 {
    private static final Scanner in = new Scanner(System.in);

    private static String difficulty;
    private static String guess;
    private static boolean playAgain = true;

    public static void main(String[] args) {
        NumberGame game = new NumberGame();

        while (playAgain){
            readInitialInput();
            playAgain = game.guessingGame(difficulty,guess);
        }
    }


    public static void readInitialInput() {
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        difficulty = in.next();
        System.out.print("I have my number. What's your guess? ");
        guess = in.next();
    }
}
