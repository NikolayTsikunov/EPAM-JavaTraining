package by.epam.javatraining.tsikunov.task03.model.logic;

import java.util.Random;

public class MoodChecker {

    final static private String CRY = "T_T";
    final static private String SAD = ":(";
    final static private String DISAPPOINTMENT = ":/";
    final static private String NEUTRAL = ":|";
    final static private String JOY = ":)";
    final static private String HAPPY = "XD";

    final static private int CRY_VALUE = 0;
    final static private int SAD_VALUE = 1;
    final static private int DISAPPOINTMENT_VALUE = 2;
    final static private int NEUTRAL_VALUE = 3;
    final static private int JOY_VALUE = 4;
    final static private int COUNT_OF_MOODS = 5;
    
    final static private Random random = new Random();
    

    public static String findMood() {
        String mood = HAPPY;
        int numberMood = random.nextInt(COUNT_OF_MOODS);
        switch (numberMood) {
            case CRY_VALUE: mood = CRY; break;
            case SAD_VALUE: mood = SAD; break;
            case DISAPPOINTMENT_VALUE: mood = DISAPPOINTMENT; break;
            case NEUTRAL_VALUE: mood = NEUTRAL; break;
            case JOY_VALUE: mood = JOY; break;
        }
        return mood;
    }
}
