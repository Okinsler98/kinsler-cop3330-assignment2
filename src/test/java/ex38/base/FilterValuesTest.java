/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex38.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterValuesTest {
    FilterValues filter = new FilterValues();

    @Test
    void filterEvenNumbers_filters_correct_values (){
        char testList[] = {'1', '2', '3', '4'};

        char actual[] = filter.filterEvenNumbers(testList);
        char expected[] = {'2', '4'};

        assertArrayEquals(expected, actual);

    }

    @Test
    void filterEvenNumbers_filters_correct_values_with_repeating_numbers (){
        char testList[] = {'1', '2', '3', '4', '1', '2', '3', '4', '1', '2', '3', '4', '1', '2', '3', '4'};

        char actual[] = filter.filterEvenNumbers(testList);
        char expected[] = {'2', '4', '2', '4', '2', '4', '2', '4'};

        assertArrayEquals(expected, actual);

    }

}