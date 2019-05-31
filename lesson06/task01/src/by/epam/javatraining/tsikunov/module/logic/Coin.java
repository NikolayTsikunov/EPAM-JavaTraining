package by.epam.javatraining.tsikunov.module.logic;

import java.util.Random;

public class Coin {

    final private static Random random = new Random();
    final private static int SIDES = 2;

    //head if random = 1, tail if random = 0
    public static int countHeads(int attempts) {
        if(!isValid(attempts)) {
            return -1;
        }

        int heads = 0;
        for (int i = 0; i < attempts; i++) {
            heads += random.nextInt(SIDES);
        }
        return heads;
    }

    private static boolean isValid(int attempts) {
        return attempts >= 0;
    }
}
