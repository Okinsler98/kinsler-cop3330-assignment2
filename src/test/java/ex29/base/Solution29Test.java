/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void checkInputValue_non_number_value() {

        int actual = Solution29.checkInputValue("ABC");
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void checkInputValue_zero_value() {

        int actual = Solution29.checkInputValue("0");
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void checkInputValue_number_value() {

        int actual = Solution29.checkInputValue("4");
        int expected = 2;

        assertEquals(expected, actual);
    }
}