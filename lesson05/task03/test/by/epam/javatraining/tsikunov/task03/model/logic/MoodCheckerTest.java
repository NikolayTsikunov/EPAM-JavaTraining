package by.epam.javatraining.tsikunov.task03.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodCheckerTest {

    @Test
    public void predictMood10() {
        int numberMood = 10;

        String expected = "XD";

        assertEquals(expected, MoodChecker.findMood());
    }

    @Test
    public void predictMood8() {
        int numberMood = 8;

        String expected = ":)";

        assertEquals(expected, MoodChecker.findMood());
    }

    @Test
    public void predictMood6() {
        int numberMood = 6;

        String expected = ":|";

        assertEquals(expected, MoodChecker.findMood());
    }

    @Test
    public void predictMood4() {
        int numberMood = 4;

        String expected = ":/";

        assertEquals(expected, MoodChecker.findMood());
    }

    @Test
    public void predictMood3() {
        int numberMood = 3;

        String expected = ":(";

        assertEquals(expected, MoodChecker.findMood());
    }

    @Test
    public void predictMood1() {
        int numberMood = 1;

        String expected = "T_T";

        assertEquals(expected, MoodChecker.findMood());
    }
}