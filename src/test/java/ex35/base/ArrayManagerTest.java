/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex35.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayManagerTest {

    @Test
    void addToArray_adds_names_to_array() {
        ArrayManager manager = new ArrayManager();

        ArrayList actual = new ArrayList();

        manager.addToArray(actual, "John");

        ArrayList expected = new ArrayList();
        expected.add("John");

        assertEquals(expected, actual);
    }

    @Test
    void addToArray_returns_true_on_name() {
        ArrayManager manager = new ArrayManager();

        ArrayList list = new ArrayList();

        boolean actual = manager.addToArray(list, "John");

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void addToArray_returns_false_on_blank() {
        ArrayManager manager = new ArrayManager();

        ArrayList list = new ArrayList();

        boolean actual = manager.addToArray(list, "");

        boolean expected = false;

        assertEquals(expected, actual);
    }


}