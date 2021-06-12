package ex24.base;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_anagrams() {

        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("note", "note");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_true_for_different_anagrams() {

        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("note", "note");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_for_nonAnagrams() {

        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("toon", "note");
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_for_different_length_words() {

        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("tunafish", "bee");
        boolean expected = false;

        assertEquals(expected, actual);
    }
}