/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex32.base;

import java.util.Scanner;
import java.util.Random;


public class NumberGame {
    private static int answer;
    private static int guessCount = 1;
    private static String playAgain;


    public boolean guessingGame(String difficulty, String guess, Scanner in){
        Random rand = new Random();

        switch (Integer.parseInt(difficulty)){
            case 1 :
                answer = rand.nextInt(11);
                break;
            case 2 :
                answer = rand.nextInt(101);
                break;
            case 3 :
                answer = rand.nextInt(1001);
                break;
            default :
                System.out.println("Difficulty can only be a number between 1 and 3.");
                return guessingGame(difficulty, guess, in);
        }
        while (true){
            if (Integer.parseInt(guess) < answer){
                System.out.print("Too low. Guess again: ");
                guess = enterValue(in);
            }else if (Integer.parseInt(guess) > answer){
                System.out.print("Too high. Guess again: ");
                guess = enterValue(in);
            } else {
                System.out.println("You got it in " + guessCount + " guesses!\n");
                while (true){
                    System.out.println("Do you wish to play again (Y/N)? ");

                    playAgain = in.next();

                    if (playAgain.compareToIgnoreCase("y") == 0){
                        return true;
                    } else if (playAgain.compareToIgnoreCase("n") == 0){
                        return false;
                    }
                }
            }
        }
    }

    public static String enterValue(Scanner in){
        String output = in.next();
        guessCount++;
        for (int i = 0; i < output.length(); i++){
            if (!Character.isDigit(output.charAt(i))){
                System.out.print("Please Enter a numeric value: ");
                output = enterValue(in);
            }
        }
        return output;
    }
}
