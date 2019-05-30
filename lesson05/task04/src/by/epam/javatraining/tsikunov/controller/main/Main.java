package by.epam.javatraining.tsikunov.controller.main;

import by.epam.javatraining.tsikunov.model.logic.Date;
import by.epam.javatraining.tsikunov.view.presentation.Printer;

public class Main {
    public static void main(String[] args) {

        int day = 31, month = 10, year = 2000;
        String nextDate = Date.takeNextDate(day, month, year);
        String date = day + "." + month + "." + year;
        Printer.print(date, nextDate);

    }
}
