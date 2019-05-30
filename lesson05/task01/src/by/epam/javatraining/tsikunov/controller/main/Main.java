package by.epam.javatraining.tsikunov.controller.main;

import by.epam.javatraining.tsikunov.model.logic.Dragon;
import by.epam.javatraining.tsikunov.view.presentation.Printer;

public class Main {
    public static void main(String[] args) {

        int ageFirst = 150;
        int ageSecond = 220;
        int ageThird = 350;
        int ageFool = -22;

        int heads = Dragon.countHeads(ageFirst);
        Printer.print(ageFirst, heads);

        heads = Dragon.countHeads(ageSecond);
        Printer.print(ageSecond, heads);

        heads = Dragon.countHeads(ageThird);
        Printer.print(ageThird, heads);

        heads = Dragon.countHeads(ageFool);
        Printer.print(ageFool, heads);
    }
}
