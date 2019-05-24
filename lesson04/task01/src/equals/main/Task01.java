package equals.main;

import equals.logic.NumberComparator;

public class Task01 {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 3.0;
        double c = 4.0;

        System.out.println("**** Comparison testing ****");
        System.out.printf("Is %.2f == %.2f == %.2f: %b\n", a, b, c, NumberComparator.isNumbersEqual(a, b, c));

        double x = 5.0;
        double y = 5.0;
        double z = 5.0;

        System.out.printf("Is %.2f == %.2f == %.2f: %b\n", x, y, z, NumberComparator.isNumbersEqual(x, y, z));
    }
}
