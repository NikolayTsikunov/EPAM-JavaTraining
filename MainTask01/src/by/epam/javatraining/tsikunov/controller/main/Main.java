package by.epam.javatraining.tsikunov.controller.main;

import by.epam.javatraining.tsikunov.model.container.Vector;
import by.epam.javatraining.tsikunov.model.processing.VectorSorting;
import by.epam.javatraining.tsikunov.view.print.Printer;

public class Main {

    public static void main(String[] args) {

        Vector vector = new Vector();
        vector.add(5, 7, 3, 1, 4, 1, 6, 9, 10);
        Printer.print("Vector: " + vector.toString());
        VectorSorting.sortInsertionIncrease(vector);
        Printer.print("Sorted vector: " + vector.toString());
        vector.add(20);
        Printer.print("Vector after addition: " + vector.toString());

    }

}
