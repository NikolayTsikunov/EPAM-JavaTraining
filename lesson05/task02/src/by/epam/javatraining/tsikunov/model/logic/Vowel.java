package by.epam.javatraining.tsikunov.model.logic;

public class Vowel {

    final private static String VOWELS = "аеёиоуыэюя";
    final private static char[] LETTERS = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};

    public static boolean isVowelFirst(char letter) {

        return VOWELS.contains(Character.toString(letter).toLowerCase());

    }

    public static boolean isVowelSecond(char letter) {

        letter = Character.toLowerCase(letter);

        for (int i = 0; i < LETTERS.length; i++) {
            if (LETTERS[i] == letter) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowelThird(char letter) {
        return VOWELS.indexOf(letter) >= 0;
    }

}
