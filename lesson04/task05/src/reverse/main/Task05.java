package reverse.main;

import reverse.logic.ParsingNumbers;

public class Task05 {
    public static void main(String[] args) {
        int number = 8543297;
        int reverseNumber = 0;

        reverseNumber = ParsingNumbers.putDigit(reverseNumber, ParsingNumbers.takeDigit(number, 1), 7);
        reverseNumber = ParsingNumbers.putDigit(reverseNumber, ParsingNumbers.takeDigit(number, 2), 6);
        reverseNumber = ParsingNumbers.putDigit(reverseNumber, ParsingNumbers.takeDigit(number, 3), 5);
        reverseNumber = ParsingNumbers.putDigit(reverseNumber, ParsingNumbers.takeDigit(number, 4), 4);
        reverseNumber = ParsingNumbers.putDigit(reverseNumber, ParsingNumbers.takeDigit(number, 5), 3);
        reverseNumber = ParsingNumbers.putDigit(reverseNumber, ParsingNumbers.takeDigit(number, 6), 2);
        reverseNumber = ParsingNumbers.putDigit(reverseNumber, ParsingNumbers.takeDigit(number, 7), 1);

        System.out.println(number);
        System.out.println(reverseNumber);
    }
}
