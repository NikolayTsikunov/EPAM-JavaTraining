package by.epam.javatraining.tsikunov.view.prezentation;

public class Printer {
    public static void print(int heads, int tails, int attempts) {

        System.out.printf("Count of heads = %d, tails = %d," +
                " if count of attempts = %d", heads, tails, attempts);
    }

    public static void printError(int attempts) {
        System.out.printf("Wrong count of attempts %d", attempts);
    }
}
