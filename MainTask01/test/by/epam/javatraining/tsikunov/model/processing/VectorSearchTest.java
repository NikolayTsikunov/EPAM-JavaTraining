package by.epam.javatraining.tsikunov.model.processing;

import by.epam.javatraining.tsikunov.model.container.Vector;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VectorSearchTest {
    private static final Logger LOGGER = Logger.getRootLogger();

    @Test
    public void maxTest() {
        Vector vector = new Vector();
        vector.add(5, 8, 6, 7, 2, 9);

        double expected = 9.;
        assertEquals(expected, VectorLogic.getMax(vector), 0.3);
    }

    @Test
    public void minTest() {
        Vector vector = new Vector();
        vector.add(5, 8, 6, 7, 2, 9);

        double expected = 2;
        assertEquals(expected, VectorLogic.getMin(vector), 0.3);
    }

    @Test
    public void countArithmeticMeanTest() {
        Vector vector = new Vector();
        vector.add(5, 8, 6, 7, 2, 9);

        double expected = 6.16;

        assertEquals(expected, VectorLogic.countArithmeticMean(vector), 0.01);
    }

    @Test
    public void countGeometricMeanTest() {
        Vector vector = new Vector();
        vector.add(5, 8, 6, 7, 2, 9);

        double expected = 5.581;
        assertEquals(expected, VectorLogic.countGeometricMean(vector), 0.01);
    }

    @Test
    public void isDecreaseTest() {
        Vector vector = new Vector();
        vector.add(9, 5, 4, 3, 1, 0);

        assertTrue(VectorLogic.isDecrease(vector));
    }

    @Test
    public void isRiseTest() {
        Vector vector = new Vector();
        vector.add(1, 3, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19);

        assertTrue(VectorLogic.isRise(vector));
    }

    @Test
    public void testIsOrdered() {
        Vector vector = new Vector();
        vector.add(9, 5, 4, 3, 1, 0);

        assertTrue(VectorLogic.isOrdered(vector));
    }

    @Test
    public void testLocalMinimum() {
        Vector vector = new Vector();
        vector.add(9, 5, 10, 3, 1, 0);

        int expected = 1;

        assertEquals(expected, VectorLogic.findLocalMinPosition(vector));
    }

    @Test
    public void testLocalMaximum() {
        Vector vector = new Vector();
        vector.add(9, 5, 4, 10, 1, 0);

        int expected = 3;

        assertEquals(expected, VectorLogic.findLocalMaxPosition(vector));
    }

    @Test
    public void testReverse() {
        Vector vector = new Vector();
        vector.add(9, 5, 4, 10, 1, 0);

        Vector vectorExpected = new Vector();
        vectorExpected.add(0, 1, 10, 4, 5, 9);

        VectorLogic.reverse(vector);


        assertEquals(vectorExpected, vector);
    }


    @Test
    public void findIndexOfTest() {
        Vector vector = new Vector();
        vector.add(9, 5, 4, 10, 1, 0);
        double number = 5.;
        int expected = 1;

        assertEquals(expected, VectorSearch.findIndexOf(vector, number));
    }

    @Test
    public void findIndexOfBinaryTest() {
        Vector vector = new Vector();
        vector.add(1, 3, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19);
        double number = 5.;
        int expected = 2;

        assertEquals(expected, VectorSearch.findIndexOfBinary(vector, number));
    }

    @Test
    public void testBubbleSortIncrease() {
        Vector vector = new Vector();
        vector.add(9, 5, 4, 10, 1, 0);

        Vector expectedVector = new Vector();
        expectedVector.add(0, 1, 4, 5, 9, 10);

        VectorSorting.sortBubbleIncrease(vector);

        assertEquals(expectedVector, vector);
    }

    @Test
    public void testBubbleSortDecrease() {
        Vector vector = new Vector();
        vector.add(9, 5, 4, 10, 1, 0);

        Vector expectedVector = new Vector();
        expectedVector.add(10, 9, 5, 4, 1, 0);

        VectorSorting.sortBubbleDecrease(vector);

        assertEquals(expectedVector, vector);
    }

}