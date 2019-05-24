package ring.main;

import ring.logic.Circle;
import ring.logic.Ring;

public class Task02 {
    public static void main(String[] args) {

        System.out.println("**** Demonstrate Rings ****");

        int radiusOne = 10;
        int radiusTwo = 5;

        System.out.printf("Radiuses of circles: %d and %d\n", radiusOne, radiusTwo);

        double squareOne = Circle.calculateSquare(radiusOne);
        double squareTwo = Circle.calculateSquare(radiusTwo);

        System.out.printf("The square of the first circle: %.2f\n", squareOne);
        System.out.printf("The square of the second circle: %.2f\n", squareTwo);
        System.out.printf(
                "The square of the ring: %.2f",
                Ring.calculateSquare(squareOne, squareTwo)
        );
    }
}
