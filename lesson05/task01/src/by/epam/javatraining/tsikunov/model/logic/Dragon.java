package by.epam.javatraining.tsikunov.model.logic;

public class Dragon {

    private static final int STARTED_HEAD_COUNT = 3;
    private static final int FIRST_LIFE_PERIOD = 200;
    private static final int SECOND_LIFE_PERIOD = 100;
    private static final int HEADS_IN_FIRST_PERIOD = 3;
    private static final int HEADS_IN_SECOND_PERIOD = 2;

    public static int countHeads(int age) {

        if(age < 0) {
            return 0; //Protect from fool. I don't know how to make it better
        }

        int heads = STARTED_HEAD_COUNT;

        if(age <= FIRST_LIFE_PERIOD) {

            heads += age * HEADS_IN_FIRST_PERIOD;

        } else if(age <= (FIRST_LIFE_PERIOD + SECOND_LIFE_PERIOD)) {

            heads += FIRST_LIFE_PERIOD * HEADS_IN_FIRST_PERIOD
                    + (age - FIRST_LIFE_PERIOD) * HEADS_IN_SECOND_PERIOD;

        } else {

            heads += FIRST_LIFE_PERIOD * HEADS_IN_FIRST_PERIOD
                    + SECOND_LIFE_PERIOD * HEADS_IN_SECOND_PERIOD
                    + (age - SECOND_LIFE_PERIOD - FIRST_LIFE_PERIOD);

        }

        return heads;
    }

}
