/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    void InputValidator_validate_wrong_entry_name() {

        InputValidator validator = new InputValidator();

        boolean actual = validator.validateInput("J", 1);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void InputValidator_validate_no_entry_name() {

        InputValidator validator = new InputValidator();

        boolean actual = validator.validateInput("", 1);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void InputValidator_validate_wrong_entry_zip() {

        InputValidator validator = new InputValidator();

        boolean actual = validator.validateInput("ABCDE", 2);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void InputValidator_validate_wrong_entry_id() {

        InputValidator validator = new InputValidator();

        boolean actual = validator.validateInput("A12-1234", 3);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void InputValidator_validate_right_entry_name() {

        InputValidator validator = new InputValidator();

        boolean actual = validator.validateInput("John", 1);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void InputValidator_validate_right_entry_zip() {

        InputValidator validator = new InputValidator();

        boolean actual = validator.validateInput("55555", 2);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void InputValidator_validate_right_entry_id() {

        InputValidator validator = new InputValidator();

        boolean actual = validator.validateInput("TK-4321", 3);
        boolean expected = true;

        assertEquals(expected, actual);
    }
}