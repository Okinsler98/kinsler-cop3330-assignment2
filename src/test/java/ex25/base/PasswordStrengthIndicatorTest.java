/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex25.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthIndicatorTest {

    @Test
    void passwordValidator_validate_very_weak_password() {

        PasswordStrengthIndicator validator = new PasswordStrengthIndicator();

        int actual = validator.passwordValidator("12345");
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_validate_weak_password() {

        PasswordStrengthIndicator validator = new PasswordStrengthIndicator();

        int actual = validator.passwordValidator("abcdef");
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_validate_strong_password() {

        PasswordStrengthIndicator validator = new PasswordStrengthIndicator();

        int actual = validator.passwordValidator("abc123xyz");
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_validate_very_strong_password() {

        PasswordStrengthIndicator validator = new PasswordStrengthIndicator();

        int actual = validator.passwordValidator("1337h@xor!");
        int expected = 4;

        assertEquals(expected, actual);
    }
}