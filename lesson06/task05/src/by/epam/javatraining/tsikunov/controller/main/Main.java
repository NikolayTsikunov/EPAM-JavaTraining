package by.epam.javatraining.tsikunov.controller.main;

import by.epam.javatraining.tsikunov.model.simple.Number;
import by.epam.javatraining.tsikunov.view.printer.Printer;

public class Main {
    public static void main(String[] args) {

        int number = 1234;
        boolean is = Number.isSimple(number);
        Printer.print(number, is);

        number = 19;
        is = Number.isSimple(number);
        Printer.print(number, is);
    }
}
