package by.epam.javatraining.tsikunov.view.presentation;

public class Print {
    public static void print(char letter, boolean isVowel) {
        System.out.printf("Is the character '%c' a vowel letter: %b\n", letter, isVowel);
    }
}
