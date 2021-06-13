package ex32.base;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class NumberGameTest {

    @Test
    void compareGuess_retruns_true_for_correct_answer() {

        ByteArrayInputStream in = new ByteArrayInputStream("n".getBytes());
        System.setIn(in);

        NumberGame game = new NumberGame();

        boolean actual = game.compareGuess("1",1);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}