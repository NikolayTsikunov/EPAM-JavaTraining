package by.epam.javatraining.tsikunov.task03.model.logic;

public class MoodChecker {

    final static private String CRY = "T_T";
    final static private String SAD = ":(";
    final static private String DISAPPOINTMENT = ":/";
    final static private String NEUTRAL = ":|";
    final static private String JOY = ":)";
    final static private String HAPPY = "XD";

    public static String predictMood() {
        int numberMood = Randomiser.takeNumber();
        return findMood(numberMood);
    }

    public static String findMood(int numberMood) {
        String mood = HAPPY;

        if(numberMood < 2) {
            mood = CRY;
        } else if(numberMood < 4) {
            mood = SAD;
        } else if(numberMood < 6) {
            mood = DISAPPOINTMENT;
        } else if(numberMood < 8) {
            mood = NEUTRAL;
        } else if(numberMood < 10) {
            mood = JOY;
        }
        return mood;
    }
}
