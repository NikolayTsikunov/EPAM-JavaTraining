package ring.logic;

public class Circle {
    public static double calculateSquare(int radius) {
        if(radius == 0) {
            return 0;
        } else {
            return Math.PI * Math.pow(radius, 2);
        }
    }
}
