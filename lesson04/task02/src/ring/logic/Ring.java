package ring.logic;

public class Ring {
    public static double calculateSquare(double squareOne, double squareTwo) {
        if(squareOne == squareTwo || squareOne == 0 || squareTwo == 0) {
            return 0;
        } else {
            return Math.abs(squareOne - squareTwo);
        }
    }
}
