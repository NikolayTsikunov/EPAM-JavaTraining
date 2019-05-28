package numbers.logic;

public class MathCalculation {

    final private static int ONE = 1;
    final private static int TWO = 2;
    final private static int TREE = 3;
    final private static int FOUR = 4;
    final private static int FIVE = 5;
    final private static int SIX = 6;

    public static double countArithmeticMean(int number) {

        return calculateSum(number) / SIX;
    }

    public static double countGeometricMean(int number) {
        return Math.pow(calculateComposition(number), 1.0 / SIX);
    }

    private static double calculateSum(int number) {

        int digit = ParsingNumbers.takeDigit(number, SIX);
        int sum = digit;
        digit = ParsingNumbers.takeDigit(number, FIVE);
        sum += digit;
        digit = ParsingNumbers.takeDigit(number, FOUR);
        sum += digit;
        digit = ParsingNumbers.takeDigit(number, TREE);
        sum += digit;
        digit = ParsingNumbers.takeDigit(number, TWO);
        sum += digit;
        digit = ParsingNumbers.takeDigit(number, ONE);
        sum += digit;

        return sum;
    }

    private static int calculateComposition(int number) {
        int digit = ParsingNumbers.takeDigit(number, SIX);
        int composition = digit;
        digit = ParsingNumbers.takeDigit(number, FIVE);
        composition *= digit;
        digit = ParsingNumbers.takeDigit(number, FOUR);
        composition *= digit;
        digit = ParsingNumbers.takeDigit(number, TREE);
        composition *= digit;
        digit = ParsingNumbers.takeDigit(number, TWO);
        composition *= digit;
        digit = ParsingNumbers.takeDigit(number, ONE);
        composition *= digit;

        return composition;
    }
}
