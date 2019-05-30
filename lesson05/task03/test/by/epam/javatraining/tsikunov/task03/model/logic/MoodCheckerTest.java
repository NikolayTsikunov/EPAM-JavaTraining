package by.epam.javatraining.tsikunov.task03.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodCheckerTest {

    @Test
    public void predictMood9() {
        int numberMood = 9;

        String expected = "XD";

        assertEquals(expected, MoodChecker.findMood(numberMood));
    }

    @Test
    public void predictMood7() {
        int numberMood = 7;

        String expected = ":)";

        assertEquals(expected, MoodChecker.findMood(numberMood));
    }

    @Test
    public void predictMood5() {
        int numberMood = 5;

        String expected = ":|";

        assertEquals(expected, MoodChecker.findMood(numberMood));
    }

    @Test
    public void predictMood3() {
        int numberMood = 3;

        String expected = ":/";

        assertEquals(expected, MoodChecker.findMood(numberMood));
    }

    @Test
    public void predictMood1() {
        int numberMood = 1;

        String expected = ":(";

        assertEquals(expected, MoodChecker.findMood(numberMood));
    }

    @Test
    public void predictMood0() {
        int numberMood = 0;

        String expected = "T_T";

        assertEquals(expected, MoodChecker.findMood(numberMood));
    }
}