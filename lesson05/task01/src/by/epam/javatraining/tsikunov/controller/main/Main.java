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
        int eyes = Dragon.countEyes(ageFirst);
        Printer.print(ageFirst, heads, eyes);

        heads = Dragon.countHeads(ageSecond);
        eyes = Dragon.countEyes(ageSecond);
        Printer.print(ageSecond, heads, eyes);

        heads = Dragon.countHeads(ageThird);
        eyes = Dragon.countEyes(ageThird);
        Printer.print(ageThird, heads, eyes);

        heads = Dragon.countHeads(ageFool);
        eyes = Dragon.countEyes(ageFool);
        Printer.print(ageFool, heads, eyes);
    }
}
