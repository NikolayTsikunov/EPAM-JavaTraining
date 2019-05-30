package by.epam.javatraining.tsikunov.task03.controller.main;

import by.epam.javatraining.tsikunov.task03.model.logic.MoodChecker;
import by.epam.javatraining.tsikunov.task03.view.presentation.Printer;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            Printer.print(MoodChecker.predictMood());
        }
    }

}
