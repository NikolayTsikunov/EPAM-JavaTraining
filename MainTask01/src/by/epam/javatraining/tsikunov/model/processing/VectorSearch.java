package by.epam.javatraining.tsikunov.model.processing;

import by.epam.javatraining.tsikunov.model.container.Vector;
import org.apache.log4j.Logger;

/**
 * This class contains different static methods for search in class Vector.
 *
 * @author Tsikunov Nikolay Pavlovich
 * @version 1.0.0
 * @see Double
 * @see Vector
 */
public class VectorSearch {
    private static final Logger LOGGER = Logger.getRootLogger();

    /**
     * This method finds index of number in the vector
     * Linear search
     *
     * @param vector The vector where index of number is being sought
     * @param number The number that is seeking in the vector
     * @return int - index of number in vector, -1 if number hasn't been found in vector
     */
    public static int findIndexOf(Vector vector, double number) {

        for (int i = 0; i < vector.getSize(); i++) {
            if(vector.getElement(i) == number) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method finds index of number in the vector
     * Binary search
     * If the vector is not sorted, the results is undefined.
     *
     * @param vector The vector where index of number is being sought
     * @param number The number that is seeking in the vector
     * @return int - index of number in vector, -1 if number hasn't been found in vector
     */
    public static int findIndexOfBinary(Vector vector, double number) {
        if(isExist(vector)) {
            return binarySearch(vector, number, 0, vector.getSize() - 1);
        }
        return -1;
    }

    /**
     * This sub-method for finding index of number in the vector
     * Binary search
     *
     *
     * @param vector The vector where index of number is being sought
     * @param number The number that is seeking in the vector
     * @param left The left border of sub-vector for seeking
     * @param right The right border of sub-vector for seeking
     * @return int - index of number in vector, -1 if number hasn't been found in vector
     */
    private static int binarySearch(Vector vector, double number, int left, int right) {
        if(right < left) {
            return -1;
        }

        int middle = left + (right - left) / 2;

        int result;

        if(vector.getElement(middle) == number) {
            result = middle;
        } else if(vector.getElement(middle) > number) {
            result = binarySearch(vector, number, left, middle - 1);
        } else {
            result = binarySearch(vector, number, middle + 1, right);
        }

        return result;
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
