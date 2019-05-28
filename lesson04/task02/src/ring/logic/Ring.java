package ring.logic;

public class Ring {
    public static double calculateSquare(double radiusOne, double radiusTwo) {
        if (radiusOne == 0 || radiusTwo == 0) { // ring doesn't exist with inner circle's radius == 0
            return 0;
        }
        double squareOne = Circle.calculateSquare(radiusOne);
        double squareTwo = Circle.calculateSquare(radiusTwo);
        double ringSquare = squareOne - squareTwo;
        return ringSquare < 0 ? -ringSquare : ringSquare;
    }
}
