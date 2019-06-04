package by.epam.javatraining.tsikunov.controller.main;

import by.epam.javatraining.tsikunov.model.logic.Date;
import by.epam.javatraining.tsikunov.view.presentation.Printer;

public class Main {
    public static void main(String[] args) {

        int day = 30, month = 11, year = 2001;
        String nextDate = Date.takeNextDate(day, month, year);
        String date = day + "." + month + "." + year;
        Printer.print(date, nextDate);

    }
}
