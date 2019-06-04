package by.epam.javatraining.tsikunov.task03.model.logic;

import java.util.Random;

public class Randomiser {

    final private static int MOOD_RANGE = 11;
    final private static Random random = new Random();

    public static int takeNumber() {

        return random.nextInt(MOOD_RANGE);
    }
}
