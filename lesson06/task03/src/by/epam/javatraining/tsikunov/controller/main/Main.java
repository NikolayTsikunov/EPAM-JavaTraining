package by.epam.javatraining.tsikunov.controller.main;

import by.epam.javatraining.tsikunov.model.factorial.Factorial;
import by.epam.javatraining.tsikunov.view.printer.Printer;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        int wrongNumber = -6;

        int factorial = Factorial.countFactorial(number);
        Printer.print(number, factorial);

        factorial = Factorial.countFactorial(wrongNumber);
        Printer.print(wrongNumber, factorial);
    }
}
