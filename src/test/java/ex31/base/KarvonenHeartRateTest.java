/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenHeartRateTest {
    KarvonenHeartRate hrCalc = new KarvonenHeartRate();

    @Test
    void calculateHR_output_correct_values (){

        int actual = hrCalc.calculateHR(65, 22, 55);
        int expected = 138;

        assertEquals(expected, actual);
    }

    @Test
    void calculateHR_output_correct_values_more (){

        int actual = hrCalc.calculateHR(65, 22, 95);
        int expected = 191;

        assertEquals(expected, actual);
    }
}