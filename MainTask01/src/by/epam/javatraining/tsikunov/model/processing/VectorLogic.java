package by.epam.javatraining.tsikunov.model.processing;

import by.epam.javatraining.tsikunov.model.container.Vector;
import org.apache.log4j.Logger;

/**
 * This class contains static methods for work with class Vector.
 *
 * @author Tsikunov Nikolay Pavlovich
 * @version 1.0
 * @see Double
 * @see Vector
 */

public class VectorLogic {
    private static final Logger LOGGER = Logger.getRootLogger();

    /**
     * This method finds the maximum value of the vector.
     *
     * @param vector The vector in which the maximum value will be searched
     * @return The maximum value of vector, or Integer.MIN_VALUE if the vector length is 0
     */
    public static double getMax(Vector vector) {
        double max = Double.MIN_VALUE;
        if (isExist(vector)) {
            for (int i = 0; i < vector.getSize(); i++) {
                if (max < vector.getElement(i)) {
                    max = vector.getElement(i);
                }
            }
        }
        return max;
    }

    /**
     * This method finds the minimum value of the vector.
     *
     * @param vector The vector in which the minimum value will be searched
     * @return The maximum value of source vector, or Integer.MAX_VALUE if the vector length is 0
     */
    public static double getMin(Vector vector) {
        double min = Double.MAX_VALUE;
        if (isExist(vector)) {
            for (int i = 0; i < vector.getSize(); i++) {
                if (min > vector.getElement(i)) {
                    min = vector.getElement(i);
                }
            }
        }
        return min;
    }

    /**
     * This method finds the Arithmetic Mean of the vector.
     *
     * @param vector The vector that is used for counting Arithmetic Mean
     * @return The Arithmetic Mean of the vector, or Integer.MIN_VALUE if the vector length is 0
     */
    public static double countArithmeticMean(Vector vector) {
        double sum = Double.NaN;

        if (isExist(vector) && vector.getSize() > 0) {
            sum = vector.getElement(0);
            for (int i = 1; i < vector.getSize(); i++) {
                sum += vector.getElement(i);
            }
            sum /= vector.getSize();
        }

        return sum;
    }

    /**
     * This method finds the Geometric Mean of the vector.
     *
     * @param vector The vector that is used for counting Geometric Mean
     * @return The Geometric Mean of the vector, or Integer.MIN_VALUE if the vector length is 0
     */
    public static double countGeometricMean(Vector vector) {
        double mult = Double.NaN;

        if (isExist(vector) && vector.getSize() > 0) {
            mult = vector.getElement(0);
            for (int i = 1; i < vector.getSize(); i++) {
                mult *= vector.getElement(i);
            }
            mult = Math.pow(mult, 1.0 / vector.getSize());
        }

        return mult;
    }

    /**
     * This method checks is numbers of vector decrease
     *
     * @param vector The vector that is used for checking decrease
     * @return True if vector's numbers are decrease, False if not or vector's length = 0
     */
    public static boolean isDecrease(Vector vector) {
        if (!isExist(vector) && vector.getSize() == 0) {
            return false;
        }

        for (int i = 1; i < vector.getSize(); i++) {
            if (vector.getElement(i - 1) < vector.getElement(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method checks is numbers of vector rise
     *
     * @param vector The vector that is used for checking rise
     * @return True if vector's numbers are rise, False if not or vector's length = 0
     */
    public static boolean isRise(Vector vector) {
        if (!isExist(vector) && vector.getSize() == 0) {
            return false;
        }

        for (int i = 1; i < vector.getSize(); i++) {
            if (vector.getElement(i - 1) > vector.getElement(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks that vector values are ordered.
     *
     * @param vector the vector which will be checked
     * @return true if vector values are ordered, or false if vector are not ordered or the vector length is 0 or null
     */
    public static boolean isOrdered(Vector vector) {
        return isExist(vector) && vector.getSize() != 0 && (isDecrease(vector) || isRise(vector));
    }

    /**
     * Finds position of the local minimum of vector.
     *
     * @param vector the vector in which local minimum will be found
     * @return the position of the local minimum, or -1 if there is no local minimum or the vector length is 0
     */
    public static int findLocalMinPosition(Vector vector) {
        if (isExist(vector) && vector.getSize() > 0) {
            for (int i = 1; i < vector.getSize() - 1; i++) {
                if (vector.getElement(i) < vector.getElement(i - 1)
                        && vector.getElement(i) < vector.getElement(i + 1)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Finds position of the local maximum of vector.
     *
     * @param vector the vector in which local maximum will be found
     * @return the position of the local maximum, or -1 if there is no local maximum or the vector length is 0
     */
    public static int findLocalMaxPosition(Vector vector) {
        if (isExist(vector) && vector.getSize() > 0) {
            for (int i = 1; i < vector.getSize() - 1; i++) {
                if (vector.getElement(i) > vector.getElement(i - 1)
                        && vector.getElement(i) > vector.getElement(i + 1)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Reverse vector
     *
     * @param vector the vector which will be reversed
     */
    public static void reverse(Vector vector) {
        if(isExist(vector)) {
            for (int i = 0, j = vector.getSize() - 1; i < j; i++, j--) {
                vector.swap(i, j);
            }
        }
    }

    /**
     * Checks if the pointer on vector isn't null.
     *
     * @param vector the vector which will be checked
     * @return false is the pointer is null, or true if the pointer is not null
     */
    private static boolean isExist(Vector vector) {
        if (vector == null) {
            LOGGER.warn("NullPointer");
            return false;
        }
        return true;
    }
}
