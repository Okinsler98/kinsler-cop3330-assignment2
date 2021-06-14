/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex37.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PasswordManagerTest {
    public static ArrayList list = new ArrayList();
    PasswordManager manager = new PasswordManager();


    @Test
    void passwordGenerator_generates_minimum_length() {

        String actual = manager.generatePassword(40,1,1);
        int expected = 40;

        assertEquals(expected, actual.length());
    }

    @Test
    void passwordGenerator_generates_correct_specialChar() {

        String testString = manager.generatePassword(40,20,1);
        int actual = 0;
        int expected = 20;

        for (int i = 0; i < testString.length(); i++){
            if (!Character.isLetterOrDigit(testString.charAt(i))){
                actual++;
            }
        }

        assertEquals(expected, actual);
    }

    @Test
    void passwordGenerator_generates_correct_numbers() {

        String testString = manager.generatePassword(40,1,30);
        int actual = 0;
        int expected = 30;

        for (int i = 0; i < testString.length(); i++){
            if (Character.isDigit(testString.charAt(i))){
                actual++;
            }
        }

        assertEquals(expected, actual);
    }

    @Test
    void passwordGenerator_generates_correct_letters() {

        String testString = manager.generatePassword(40,10,30);
        int actual = 0;
        int expected = 40;

        for (int i = 0; i < testString.length(); i++){
            if (Character.isLetter(testString.charAt(i))){
                actual++;
            }
        }

        assertEquals(expected, actual);
    }
}