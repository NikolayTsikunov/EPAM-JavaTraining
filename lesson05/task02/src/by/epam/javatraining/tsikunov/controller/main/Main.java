package by.epam.javatraining.tsikunov.controller.main;

import by.epam.javatraining.tsikunov.model.logic.Vowel;
import by.epam.javatraining.tsikunov.view.presentation.Print;

public class Main {
    public static void main(String[] args) {

        char letter = 'ы';
        Print.print(letter, Vowel.isVowelOne(letter));

        letter = 'п';
        Print.print(letter, Vowel.isVowelOne(letter));

        letter = 'я';
        Print.print(letter, Vowel.isVowelTwo(letter));

        letter = 'р';
        Print.print(letter, Vowel.isVowelTwo(letter));
    }
}
