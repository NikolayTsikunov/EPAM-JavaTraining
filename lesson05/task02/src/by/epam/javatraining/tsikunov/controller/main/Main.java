package by.epam.javatraining.tsikunov.controller.main;

import by.epam.javatraining.tsikunov.model.logic.Vowel;
import by.epam.javatraining.tsikunov.view.presentation.Print;

public class Main {
    public static void main(String[] args) {

        char letter = 'ы';
        Print.print(letter, Vowel.isVowelFirst(letter));

        letter = 'п';
        Print.print(letter, Vowel.isVowelFirst(letter));

        letter = 'я';
        Print.print(letter, Vowel.isVowelSecond(letter));

        letter = 'р';
        Print.print(letter, Vowel.isVowelSecond(letter));

        letter = 'ю';
        Print.print(letter, Vowel.isVowelThird(letter));

        letter = 'р';
        Print.print(letter, Vowel.isVowelThird(letter));
    }
}
