package check.logic;

public class Digits {
    public static int ONE = 1;
    public static int TWO = 2;
    public static int TREE = 3;
    public static int FOUR = 4;

    public static boolean isDigitsRise(int number) {

        int first = ParsingNumbers.takeDigit(number, FOUR);
        int second = ParsingNumbers.takeDigit(number, TREE);
        int third = ParsingNumbers.takeDigit(number, TWO);
        int fourth = ParsingNumbers.takeDigit(number, ONE);

        return first < second && second < third && third < fourth;
    }

    public static boolean isDigitsDecrease(int number) {

        int first = ParsingNumbers.takeDigit(number, FOUR);
        int second = ParsingNumbers.takeDigit(number, TREE);
        int third = ParsingNumbers.takeDigit(number, TWO);
        int fourth = ParsingNumbers.takeDigit(number, ONE);

        return first > second && second > third && third > fourth;
    }
}
