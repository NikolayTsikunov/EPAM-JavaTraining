package by.epam.javatraining.tsikunov.task03.model.logic;

public class MoodChecker {

    public static String predictMood() {
        int numberMood = Randomiser.takeNumber();
        return findMood(numberMood);
    }

    public static String findMood(int numberMood) {
        String mood;

        if(numberMood == 0) {
            mood = "T_T";
        } else if(numberMood < 2) {
            mood = ":(";
        } else if(numberMood < 4) {
            mood = ":/";
        } else if(numberMood < 6) {
            mood = ":|";
        } else if(numberMood < 9) {
            mood = ":)";
        } else {
            mood = "XD";
        }
            return mood;
    }
}
