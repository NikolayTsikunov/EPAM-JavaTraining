package by.epam.javatraining.tsikunov.model.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void isSimple() {
        int number = 1234;

        assertTrue(Number.isSimple(number));
    }
}