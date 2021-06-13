/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex36.base;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListCalculationsTest {
    public static ArrayList list = new ArrayList();
    ListCalculations calculations = new ListCalculations();


    @Test
    void avarage_returns_average() {
        addToList();

        double actual = calculations.avarage(list);
        double expected = 400;

        assertEquals(expected, actual);
    }

    @Test
    void max_returns_max() {
        addToList();

        double actual = calculations.max(list);
        double expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    void min_returns_min() {
        addToList();

        double actual = calculations.min(list);
        double expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void std_returns_std() {
        addToList();

        double actual = calculations.std(list);
        double expected = 353.55;

        assertEquals(expected, actual);
    }

    public static void addToList(){
        list.add("100");
        list.add("200");
        list.add("1000");
        list.add("300");
    }
}