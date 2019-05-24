package numbers.main;

import numbers.logic.MathCalculation;
import numbers.logic.ParsingNumbers;

public class Task04 {
    public static void main(String[] args) {
        int number = 123456;

        int one = ParsingNumbers.takeDigit(number, 6);
        int two = ParsingNumbers.takeDigit(number, 5);
        int three = ParsingNumbers.takeDigit(number, 4);
        int four = ParsingNumbers.takeDigit(number, 3);
        int five = ParsingNumbers.takeDigit(number, 2);
        int six = ParsingNumbers.takeDigit(number, 1);

        System.out.println("**** Demonstration of program ****");
        int amount = MathCalculation.calculateSumm(one, two, three, four, five, six);
        System.out.printf(
                "Arithmetic mean of %d = %.2f\n",
                number,
                MathCalculation.countArithmeticMean(amount, 6)
        );

        amount = MathCalculation.calculateComposition(one, two, three, four, five, six);
        System.out.printf(
                "Geometric mean of %d = %.2f\n",
                number,
                MathCalculation.countGeometricMean(amount, 6)
        );

    }
}
