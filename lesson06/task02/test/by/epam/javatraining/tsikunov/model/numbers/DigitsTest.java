package by.epam.javatraining.tsikunov.model.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitsTest {

    @Test
    public void isRise() {
        int number = 1234;

        assertTrue(Digits.isRise(number));
    }

    @Test
    public void isDown() {
        int number = 4321;

        assertTrue(Digits.isDown(number));
    }
}