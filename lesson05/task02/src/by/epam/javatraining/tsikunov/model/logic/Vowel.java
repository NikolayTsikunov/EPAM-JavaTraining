package by.epam.javatraining.tsikunov.model.logic;

public class Vowel {
    public static boolean isVowelOne(char letter) {

        return "аеёиоуыэюя".contains(Character.toString(letter).toLowerCase());

    }

    public static boolean isVowelTwo(char letter) {
        char[] letters = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
        boolean isVowel = false;

        letter = Character.toLowerCase(letter);

        for (int i = 0; i < letters.length; i++) {
            if(letters[i] == letter) {
                isVowel = true;
                break;
            }
        }
        return isVowel;
    }
}
