package by.epam.javatraining.tsikunov.model.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayProcessingTest {

    @Test
    public void maxTest() {
        int[] array = {5, 8, 6, 7, 2, 9};

        int expected = 9;
        assertEquals(expected, ArrayProcessing.getMax(array));
    }

    @Test
    public void minTest() {
        int[] array = {5, 8, 6, 7, 2, 9};

        int expected = 2;
        assertEquals(expected, ArrayProcessing.getMin(array));
    }

    @Test
    public void countArithmeticMeanTest() {
        int[] array = {5, 8, 6, 7, 2, 9};

        double expected = 6.16;

        assertEquals(expected, ArrayProcessing.countArithmeticMean(array), 0.01);
    }

    @Test
    public void countGeometricMeanTest() {
        int[] array = {5, 8, 6, 7, 2, 9};

        double expected = 5.581;
        assertEquals(expected, ArrayProcessing.countGeometricMean(array), 0.01);
    }

    @Test
    public void isDecreaseTest() {
        int[] array = {9, 5, 4, 2, 1, 0};

        assertTrue(ArrayProcessing.isDecrease(array));
    }

    @Test
    public void isRiseTest() {
        int[] array = {1, 2, 4, 9, 10};

        assertTrue(ArrayProcessing.isRise(array));
    }

    @Test
    public void findIndexOfTest() {
        int[] array = {9, 5, 4, 2, 1, 0};
        int number = 4;
        int expected = 2;

        assertEquals(expected, ArrayProcessing.findIndexOf(array, number));
    }

    @Test
    public void findIndexOfBinaryTest() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int number = 4;
        int expected = 3;

        assertEquals(expected, ArrayProcessing.findIndexOfBinary(array, number));
    }
}