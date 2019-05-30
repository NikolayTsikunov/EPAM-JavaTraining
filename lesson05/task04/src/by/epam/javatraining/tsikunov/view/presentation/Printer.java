package by.epam.javatraining.tsikunov.view.presentation;

public class Printer {
    public static void print(String date, String nextDate) {
        if(!nextDate.equals("Wrong date")) {
            System.out.printf("The next date after \"%s\" is \"%s\"\n", date, nextDate);
        } else {
            System.out.printf(nextDate);
        }
    }
}
