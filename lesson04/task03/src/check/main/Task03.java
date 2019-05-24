package check.main;

import check.logic.Digits;
import check.logic.ParsingNumbers;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("**** Demonstration of program ****");

        int numberOne = 1234;
        int numberTwo = 5432;
        int numberThree = 5462;

        int first = ParsingNumbers.takeDigit(numberOne, 4);
        int second = ParsingNumbers.takeDigit(numberOne, 3);
        int third = ParsingNumbers.takeDigit(numberOne, 2);
        int fourth = ParsingNumbers.takeDigit(numberOne, 1);
        boolean is = Digits.isDigitsRise(first, second, third, fourth);
        System.out.printf("Are digits of %d rise: %b\n", numberOne, is);

        first = ParsingNumbers.takeDigit(numberTwo, 4);
        second = ParsingNumbers.takeDigit(numberTwo, 3);
        third = ParsingNumbers.takeDigit(numberTwo, 2);
        fourth = ParsingNumbers.takeDigit(numberTwo, 1);
        is = Digits.isDigitsDecrease(first, second, third, fourth);
        System.out.printf("Are digits of %d decrease: %b\n", numberTwo, is);

        first = ParsingNumbers.takeDigit(numberThree, 4);
        second = ParsingNumbers.takeDigit(numberThree, 3);
        third = ParsingNumbers.takeDigit(numberThree, 2);
        fourth = ParsingNumbers.takeDigit(numberThree, 1);
        is = Digits.isDigitsRise(first, second, third, fourth);
        System.out.printf("Are digits of %d rise: %b\n", numberThree, is);
    }
}
