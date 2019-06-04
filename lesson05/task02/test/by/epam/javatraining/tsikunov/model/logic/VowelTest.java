package by.epam.javatraining.tsikunov.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {

    @Test
    public void isVowelOneTrue() {

        char letter = 'О';

        assertEquals(true, Vowel.isVowelFirst(letter));

    }

    @Test
    public void isVowelOneFalse() {

        char letter = 'п';

        assertEquals(false, Vowel.isVowelFirst(letter));
    }

    @Test
    public void isVowelTwoTrue() {

        char letter = 'О';

        assertEquals(true, Vowel.isVowelSecond(letter));

    }

    @Test
    public void isVowelTwoFalse() {

        char letter = 'п';

        assertEquals(false, Vowel.isVowelSecond(letter));
    }

    @Test
    public void isVowelThreeTrue() {

        char letter = 'ю';

        assertEquals(true, Vowel.isVowelThird(letter));
    }

    @Test
    public void isVowelThreeFalse() {

        char letter = 'п';

        assertEquals(false, Vowel.isVowelThird(letter));
    }
}