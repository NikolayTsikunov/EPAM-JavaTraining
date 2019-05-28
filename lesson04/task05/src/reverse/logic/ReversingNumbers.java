package reverse.logic;

public class ReversingNumbers {

    final private static int ONE = 1;
    final private static int TWO = 2;
    final private static int TREE = 3;
    final private static int FOUR = 4;
    final private static int FIVE = 5;
    final private static int SIX = 6;
    final private static int SEVEN = 7;

    public static int reverseNumber(int number) {

        int result = 0;

        result = ParsingNumbers.putDigit(result, ParsingNumbers.takeDigit(number, ONE));
        result = ParsingNumbers.putDigit(result, ParsingNumbers.takeDigit(number, TWO));
        result = ParsingNumbers.putDigit(result, ParsingNumbers.takeDigit(number, TREE));
        result = ParsingNumbers.putDigit(result, ParsingNumbers.takeDigit(number, FOUR));
        result = ParsingNumbers.putDigit(result, ParsingNumbers.takeDigit(number, FIVE));
        result = ParsingNumbers.putDigit(result, ParsingNumbers.takeDigit(number, SIX));
        result = ParsingNumbers.putDigit(result, ParsingNumbers.takeDigit(number, SEVEN));

        return result;
    }
}
