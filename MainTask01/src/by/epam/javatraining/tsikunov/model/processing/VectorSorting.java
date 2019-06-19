package by.epam.javatraining.tsikunov.model.processing;

import by.epam.javatraining.tsikunov.model.container.Vector;
import org.apache.log4j.Logger;

/**
 * This class contains static methods for sort MyVector.
 *
 * @author Tsikunov Nikolay Pavlovich
 * @version 1.0
 * @see Vector
 */
public class VectorSorting {
    private static final Logger LOGGER = Logger.getRootLogger();

    /**
     * Sorts all vector values in increasing order by bubble sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortBubbleIncrease(Vector vector) {
        if (isExists(vector)) {
            for (int i = 1; i < vector.getSize(); i++) {
                boolean notSort = true;
                for (int j = 0; j < vector.getSize() - i; j++) {
                    if (vector.getElement(j) > vector.getElement(j + 1)) {
                        vector.swap(j, j + 1);
                        notSort = false;
                    }
                }
                if (notSort) {
                    return;
                }
            }
        }
    }

    /**
     * Sorts all vector values in decreasing order by bubble sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortBubbleDecrease(Vector vector) {
        if (isExists(vector)) {
            for (int i = 1; i < vector.getSize(); i++) {
                boolean notSort = true;
                for (int j = 0; j < vector.getSize() - i; j++) {
                    if (vector.getElement(j) < vector.getElement(j + 1)) {
                        vector.swap(j, j + 1);
                        notSort = false;
                    }
                }
                if (notSort) {
                    return;
                }
            }
        }
    }


    /**
     * Sorts all vector values in increasing order by insertion sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortInsertionIncrease(Vector vector) {
        if (isExists(vector)) {
            for (int i = 1; i < vector.getSize(); i++) {
                double buf = vector.getElement(i);
                int j = i - 1;
                while (j >= 0 && buf < vector.getElement(j)) {
                    vector.setElement(j + 1, vector.getElement(j));
                    --j;
                }
                vector.setElement(j + 1, buf);
            }
        }
    }

    /**
     * Sorts all vector values in decreasing order by insertion sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortInsertionDecrease(Vector vector) {
        if (isExists(vector)) {
            for (int i = 1; i < vector.getSize(); i++) {
                double buf = vector.getElement(i);
                int j = i - 1;
                while (j >= 0 && buf > vector.getElement(j)) {
                    vector.setElement(j + 1, vector.getElement(j));
                    --j;
                }
                vector.setElement(j + 1, buf);
            }
        }
    }

    /**
     * Sorts all vector values in decreasing order by selection sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortSelectionDecrease(Vector vector) {
        if (isExists(vector)) {
            for (int i = 0; i < vector.getSize() - 1; i++) {
                int k = i;
                for (int j = i + 1; j < vector.getSize(); j++) {
                    if (vector.getElement(k) < vector.getElement(j)) {
                        k = j;
                    }
                }
                vector.swap(k, i);
            }
        }
    }

    /**
     * Sorts all vector values in increasing order by selection sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortSelectionIncrease(Vector vector) {
        if (isExists(vector)) {
            for (int i = 0; i < vector.getSize() - 1; i++) {
                int k = i;
                for (int j = i + 1; j < vector.getSize(); j++) {
                    if (vector.getElement(k) > vector.getElement(j)) {
                        k = j;
                    }
                }
                vector.swap(k, i);
            }
        }
    }

    /**
     * Checks if the reference is null.
     *
     * @param vector the reference which will be checked
     * @return false is the reference is null, or false if the reference is not null
     */
    private static boolean isExists(Vector vector) {
        if (vector == null) {
            LOGGER.warn("NullPointer");
            return false;
        }
        return true;
    }

}
