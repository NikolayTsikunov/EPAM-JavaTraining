package numbers.main;

import numbers.logic.MathCalculation;

public class Task04 {
    public static void main(String[] args) {
        int number = 123456;

        System.out.println("**** Demonstration of program ****");
        System.out.printf(
                "Arithmetic mean of %d = %.2f\n",
                number,
                MathCalculation.countArithmeticMean(number)
        );

        System.out.printf(
                "Geometric mean of %d = %.2f\n",
                number,
                MathCalculation.countGeometricMean(number)
        );

    }
}
