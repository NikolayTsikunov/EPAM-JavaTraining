package by.epam.javatraining.tsikunov.controller.main;


import by.epam.javatraining.tsikunov.model.numbers.Digits;
import by.epam.javatraining.tsikunov.view.printer.Printer;

public class Main {

    public static void main(String[] args) {
        int numberOne = 2468;
        int numberTwo = 4321;

        boolean is = Digits.isEven(numberOne);
        Printer.print(numberOne, is);

        is = Digits.isEven(numberTwo);
        Printer.print(numberTwo, is);

    }
}
