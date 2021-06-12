package ex24.base;

import java.util.Scanner;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args){
        readUserInput();

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1, word2);

        String output = generateOutput(result);

        System.out.println(output);
    }

    public static void readUserInput() {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string: ");
        word1 = in.next();

        System.out.println("Enter the second string: ");
        word2 = in.next();
    }

    public static String generateOutput(boolean isAnagram){
        if(isAnagram){
            return "\"" + word1 + "\" and \"" + word2 + "\" are anagrams.";
        } else {
            return "\"" + word1 + "\" and \"" + word2 + "\" are not anagrams.";
        }
    }
}
