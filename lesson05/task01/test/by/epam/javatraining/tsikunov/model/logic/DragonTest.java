package by.epam.javatraining.tsikunov.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class DragonTest {

    @Test
    public void countHeadsLess200() {
        int age = 150;

        int expected = 453;
        assertEquals(expected, Dragon.countHeads(age));
    }

    @Test
    public void countHeadsLess300() {
        int age = 220;
        int expected = 643;

        assertEquals(expected, Dragon.countHeads(age));
    }

    @Test
    public void countHeadsMore300() {
        int age = 350;
        int expected = 853;

        assertEquals(expected, Dragon.countHeads(age));
    }

    @Test
    public void countHeadsFool() {
        int age = -20;
        int expected = 0;

        assertEquals(expected, Dragon.countHeads(age));
    }

    @Test
    public void countEyes() {
        int heads = 50;
        int expected = 306;

        assertEquals(expected, Dragon.countEyes(heads));
    }
}