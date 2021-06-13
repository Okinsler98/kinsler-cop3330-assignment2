/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex33.base;

import java.util.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void list_contains_correct_phrases() {

        Solution33 magicBall = new Solution33();

        List<String> actual = new ArrayList<String>();
        magicBall.addToList(actual);

        List<String> expected = new ArrayList<String>();
        expected.add("Yes");
        expected.add("No");
        expected.add("Maybe");
        expected.add("Ask again later.");

        assertEquals(expected, actual);
    }
}