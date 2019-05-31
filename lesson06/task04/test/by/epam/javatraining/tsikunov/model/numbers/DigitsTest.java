package by.epam.javatraining.tsikunov.model.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitsTest {

    @Test
    public void isEven() {
        int number = 2468;
        assertTrue(Digits.isEven(number));
    }
}