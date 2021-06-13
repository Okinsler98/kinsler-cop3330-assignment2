/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex30.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {

    @Test
    void createMultipleTable_create_correct_multiple_array() {

        String actual[] = Solution30.createMultipleTable(2);
        String expected[] = {"1", "2", "2", "4"};

        assertArrayEquals(expected, actual);
    }

    @Test
    void createMultipleTable_create_correct_multiple_array_larger() {

        String actual[] = Solution30.createMultipleTable(4);
        String expected[] = {"1", "2", "3", "4", "2", "4", "6", "8", "3", "6", "9", "12", "4", "8", "12", "16"};

        assertArrayEquals(expected, actual);
    }

    @Test
    void generateOuput_print_correct_spacing() {

        String inputArray[] = {"1", "2", "3", "4", "2", "4", "6", "8", "3", "6", "8", "12", "4", "8", "12", "16"};
        String actual = Solution30.generateOutput(inputArray);
        String expected = "   1   2   3   4\n   2   4   6   8\n   3   6   8  12\n   4   8  12  16\n";

        assertEquals(expected, actual);
    }

}