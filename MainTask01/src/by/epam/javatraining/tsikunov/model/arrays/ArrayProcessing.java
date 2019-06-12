package by.epam.javatraining.tsikunov.model.arrays;

/**
 * This class contains different static methods for working with array.
 *
 * @author Tsikunov Nikolay Pavlovich
 * @version 1.0.0
 */
public class ArrayProcessing {

    /**
     * This method finds the maximum value of the array.
     *
     * @param array The array in which the maximum value will be searched
     * @return The maximum value of source array, or Integer.MIN_VALUE if the array length is 0
     */
    public static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * This method finds the minimum value of the array.
     *
     * @param array The array in which the minimum value will be searched
     * @return The maximum value of source array, or Integer.MAX_VALUE if the array length is 0
     */
    public static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * This method finds the Arithmetic Mean of the array.
     *
     * @param array The array that is used for counting Arithmetic Mean
     * @return The Arithmetic Mean of source array, or Integer.MIN_VALUE if the array length is 0
     */
    public static double countArithmeticMean(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    /**
     * This method finds the Geometric Mean of the array.
     *
     * @param array The array that is used for counting Geometric Mean
     * @return The Geometric Mean of source array, or Integer.MIN_VALUE if the array length is 0
     */
    public static double countGeometricMean(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }
        return Math.pow(mult, 1.0 / array.length);
    }

    /**
     * This method checks is numbers of array decrease
     *
     * @param array The array that is used for checking decrease
     * @return True if array's numbers are decrease, False if not or array's length = 0
     */
    public static boolean isDecrease(int[] array) {
        if(array.length == 0)
        {
            return false;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method checks is numbers of array rise
     *
     * @param array The array that is used for checking rise
     * @return True if array's numbers are rise, False if not or array's length = 0
     */
    public static boolean isRise(int[] array) {
        if(array.length == 0)
        {
            return false;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method finds index of number in the array
     * Linear search
     *
     * @param array The array where index of number is being sought
     * @param number The number that is seeking in the array
     * @return int - index of number in array, -1 if number hasn't been found in array
     */
    public static int findIndexOf(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method finds index of number in the array
     * Binary search
     * If the array is not sorted, the results is undefined.
     *
     * @param array The array where index of number is being sought
     * @param number The number that is seeking in the array
     * @return int - index of number in array, -1 if number hasn't been found in array
     */
    public static int findIndexOfBinary(int[] array, int number) {
        return binarySearch(array, number, 0, array.length - 1);
    }

    /**
     * This sub-method for finding index of number in the array
     * Binary search
     *
     *
     * @param array The array where index of number is being sought
     * @param number The number that is seeking in the array
     * @param left The left border of sub-array for seeking
     * @param right The right border of sub-array for seeking
     * @return int - index of number in array, -1 if number hasn't been found in array
     */
    private static int binarySearch(int[] array, int number, int left, int right) {
        if(right < left) {
            return -1;
        }

        int middle = left + (right - left) / 2;

        int result;

        if(array[middle] == number) {
            result = middle;
        } else if(array[middle] > number) {
            result = binarySearch(array, number, left, middle - 1);
        } else {
            result = binarySearch(array, number, middle + 1, right);
        }

        return result;
    }


}
