package by.epam.javatraining.tsikunov.model.numbers;

public class Digits {

    public static boolean isEven(int number) {
        boolean even = true;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                even = false;
                break;
            }
            number /= 10;
        }
        return even;
    }
}
