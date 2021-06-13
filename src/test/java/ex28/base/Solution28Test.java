/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex28.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void calculateSum_adds_values_correctly() {

        String inputTest[] = new String[5];

        for (int i = 0; i < 5; i++){
            inputTest[i] = Integer.toString(i+1);
        }

        int actual = Solution28.calculateSum(inputTest);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void calculateSum_adds_same_values_correctly() {

        String inputTest[] = new String[5];

        for (int i = 0; i < 5; i++){
            inputTest[i] = Integer.toString(2);
        }

        int actual = Solution28.calculateSum(inputTest);
        int expected = 10;

        assertEquals(expected, actual);
    }
}