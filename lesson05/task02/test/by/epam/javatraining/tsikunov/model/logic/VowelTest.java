package by.epam.javatraining.tsikunov.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {

    @Test
    public void isVowelOneTrue() {

        char letter = 'О';

        assertEquals(true, Vowel.isVowelOne(letter));

    }

    @Test
    public void isVowelOneFalse() {

        char letter = 'п';

        assertEquals(false, Vowel.isVowelOne(letter));
    }

    @Test
    public void isVowelTwoTrue() {

        char letter = 'О';

        assertEquals(true, Vowel.isVowelTwo(letter));

    }

    @Test
    public void isVowelTwoFalse() {

        char letter = 'п';

        assertEquals(false, Vowel.isVowelTwo(letter));
    }
}