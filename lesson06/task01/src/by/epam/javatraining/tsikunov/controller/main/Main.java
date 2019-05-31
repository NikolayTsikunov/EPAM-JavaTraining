package by.epam.javatraining.tsikunov.controller.main;

import by.epam.javatraining.tsikunov.module.logic.Coin;
import by.epam.javatraining.tsikunov.view.prezentation.Printer;

public class Main {
    public static void main(String[] args) {
        int attempts = 1000;

        int heads = Coin.countHeads(attempts);
        if(heads >= 0) {
            int tails = attempts - heads;
            Printer.print(heads, tails, attempts);
        } else {
            Printer.printError(attempts);
        }
    }
}
