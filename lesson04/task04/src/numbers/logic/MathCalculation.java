package numbers.logic;

public class MathCalculation {

    final private static int AMOUNT_OF_NUMBERS = 6;

    public static double countArithmeticMean(int number) {

        return calculateSum(number) / AMOUNT_NUMBERS;
    }

    public static double countGeometricMean(int number) {
        return Math.pow(calculateComposition(number), 1.0 / AMOUNT_OF_NUMBERS);
    }

    private static double calculateSum(int number) {

        int digit = number % 10;
        number /= 10;
        int sum = digit;

        digit = number % 10;
        number /= 10;
        sum += digit;

        digit = number % 10;
        number /= 10;
        sum += digit;

        digit = number % 10;
        number /= 10;
        sum += digit;

        digit = number % 10;
        number /= 10;
        sum += digit;

        sum += number;

        return sum;
    }

    private static int calculateComposition(int number) {
        int digit = number % 10;
        number /= 10;
        int composition = digit;

        digit = number % 10;
        number /= 10;
        composition *= digit;

        digit = number % 10;
        number /= 10;
        composition *= digit;

        digit = number % 10;
        number /= 10;
        composition *= digit;

        digit = number % 10;
        number /= 10;
        composition *= digit;

        composition *= number;

        return composition;
    }
}
