package check.logic;

public class Digits {

    public static boolean isDigitsRise(int number) {

        int fourth = number % 10;
        number /= 10;

        int third = number % 10;
        number /= 10;

        int second = number % 10;
        number /= 10;

        int first = number;

        return first < second && second < third && third < fourth;
    }

    public static boolean isDigitsDecrease(int number) {

        int fourth = number % 10;
        number /= 10;

        int third = number % 10;
        number /= 10;

        int second = number % 10;
        number /= 10;

        int first = number;

        return first > second && second > third && third > fourth;
    }
}
