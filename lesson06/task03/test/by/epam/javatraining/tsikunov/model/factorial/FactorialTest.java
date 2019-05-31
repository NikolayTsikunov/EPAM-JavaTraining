package by.epam.javatraining.tsikunov.model.factorial;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void countFactorial() {
        int number = 7;

        int expected = 5040;

        assertEquals(expected, Factorial.countFactorial(number));
    }

    @Test
    public void countFactorialWrong() {
        int number = -6;

        int expected = -1;

        assertEquals(expected, Factorial.countFactorial(number));
    }
}