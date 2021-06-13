/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex34.base;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListManagementTest {

    @Test
    void removeFromList_removes_specific_name() {

        ByteArrayInputStream in = new ByteArrayInputStream("Wednesday C".getBytes());
        System.setIn(in);

        ListManagement manager = new ListManagement();

        List<String> actual = new ArrayList<String>();
        actual.add("Monday A");
        actual.add("Tuesday B");
        actual.add("Wednesday C");
        actual.add("Thursday D");

        actual = manager.removeFromList(actual);

        List<String> expected = new ArrayList<String>();
        expected.add("Monday A");
        expected.add("Tuesday B");
        expected.add("Thursday D");

        assertEquals(expected, actual);
    }
}