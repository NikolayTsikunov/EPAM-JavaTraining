package by.epam.javatraining.tsikunov.model.container;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

/**
 * This class allows to work with a user's array of double values.
 *
 * @author Tsikunov Nikolay Pavlovich
 * @version 1.0
 * @see Double
 */
public class Vector {

    private static final Logger LOGGER = Logger.getRootLogger();

    /**
     * The array of double numbers, where numbers are stored
     */
    private double array[];

    /**
     * The count of stored numbers in array
     */
    private int size;

    /**
     * The size of array, shows available places in array
     */
    private int capacity;

    /**
     * The default capacity of array, if other don't mentioned
     */
    private final int DEFAULT_CAPACITY = 10;

    /**
     * The maximal possible array's capacity
     */
    private final int MAXIMUM_CAPACITY = 1_000_000_000;

    /**
     * Constructor. Creates default array
     */
    public Vector() {
        capacity = DEFAULT_CAPACITY;
        size = 0;
        array = new double[capacity];
    }

    /**
     * Constructor. Creates array with preset capacity
     *
     * @param initializeCapacity the entering value of array's capacity
     */
    public Vector(int initializeCapacity) {
        if (initializeCapacity < 0 || initializeCapacity > MAXIMUM_CAPACITY) {
            capacity = DEFAULT_CAPACITY;
            LOGGER.warn("Wrong initializeCapacity");
        } else {
            capacity = initializeCapacity;
        }
        size = 0;
        array = new double[capacity];
    }

    /**
     * Returns count of numbers in array
     *
     * @return count of numbers in array
     */
    public int getSize() {
        return size;
    }

    /**
     * Checks if position exists in array
     *
     * @param index checking index of array
     * @return true - if index exists in array, false - if not
     */
    private boolean checkIndex(int index) {
        if (index < 0 || index >= size) {
            LOGGER.warn("ArrayIndexOutOf Bounds");
            return false;
        }
        return true;
    }

    /**
     * Increase the capacity of the array if it's possible
     */
    private void increaseCapacity() {

        if (capacity < MAXIMUM_CAPACITY / 2) {
            capacity *= 2;
            copyArray();
        } else if (capacity < MAXIMUM_CAPACITY) {
            if (MAXIMUM_CAPACITY - capacity == 2) {
                capacity = MAXIMUM_CAPACITY;
            } else {
                capacity = (MAXIMUM_CAPACITY - capacity) / 2;
            }
            copyArray();
        } else {
            LOGGER.warn("MaxCapacityReached");
        }
    }

    /**
     * Create new array and copy all elements from old array
     */
    private void copyArray() {
        double[] newArray = new double[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    /**
     * Set the value to the position in the array if the position exists
     *
     * @param index where value is changed
     * @param value new value of the position
     */
    public void setElement(int index, double value) {
        if (checkIndex(index)) {
            array[index] = value;
        }
    }

    /**
     * Returns value of the index if exists, otherwise returns NaN
     *
     * @param index asking index of element
     * @return element of array if was found, otherwise NaN
     */
    public double getElement(int index) {
        double element = Double.NaN;
        if (checkIndex(index)) {
            element = array[index];
        }
        return element;
    }

    /**
     * Adds new numbers in array if it's possible
     *
     * @param numbers that will be added to array
     */
    public void add(double... numbers) {
        if (numbers != null) {

            while (size + numbers.length > capacity && capacity != MAXIMUM_CAPACITY) {
                increaseCapacity();
            }
            int newSize = size;
            for (int i = size, j = 0; j < numbers.length && i < capacity; i++, j++) {
                array[i] = numbers[j];
                newSize++;
            }
            size = newSize;

        } else {
            LOGGER.warn("Empty array");
        }
    }

    /**
     * Swaps the vectors values
     *
     * @param index1 the position of the first value
     * @param index2 the position of the second value
     */
    public void swap(int index1, int index2) {
        if (checkIndex(index1) && checkIndex(index2)) {
            double temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    /**
     * Compares the specified Object with this vector for equality.
     *
     * @param obj the Object to be compared for equality with this vector
     * @return true if the specified Object is equal to this vector
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Vector vector = (Vector) obj;
        return size == vector.size &&
                capacity == vector.capacity &&
                Arrays.equals(array, vector.array);
    }

    /**
     * Returns the hash code value for this vector.
     *
     * @return the hash code value for this vector
     */
    @Override
    public int hashCode() {
        int result = Objects.hash(size, capacity);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    /**
     * Returns a string representation of this vector.
     *
     * @return a string representation of this vector
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size - 1; i++) {
            str.append(array[i] + ", ");
        }
        str.append(array[size - 1] + "]");
        return str.toString();
    }
}
