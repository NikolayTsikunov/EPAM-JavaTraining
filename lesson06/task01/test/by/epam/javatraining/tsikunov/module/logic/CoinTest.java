package by.epam.javatraining.tsikunov.module.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinTest {

    @Test
    public void countHeads() {
        int attempts = 1000;

        int expected = -1;

        assertNotEquals(expected, Coin.countHeads(attempts));
    }

    @Test
    public void countHeadsMistake() {
        int attempts = -50;

        int expected = -1;

        assertEquals(expected, Coin.countHeads(attempts));
    }
}