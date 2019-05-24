package ring.logic;

public class Ring {
    public static double calculateSquare(double squareOne, double squareTwo) {
        return (squareOne == 0 || squareTwo == 0) ? 0 : Math.abs(squareOne - squareTwo);
    }
}
