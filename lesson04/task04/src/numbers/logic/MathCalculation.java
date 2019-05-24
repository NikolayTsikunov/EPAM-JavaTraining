package numbers.logic;

public class MathCalculation {
    public static double countArithmeticMean(int numbersSumm, int amount) {
        return (double)numbersSumm / amount;
    }
    public static double countGeometricMean(int numbersComposition, int amount) {
        return Math.pow(numbersComposition, 1.0 / amount);
    }
    public static int calculateSumm(int one, int two, int three, int four, int five, int six) {
        return one + two + three + four + five + six;
    }
    public static int calculateComposition(int one, int two, int three, int four, int five, int six) {
        return one * two * three * four * five * six;
    }
}
