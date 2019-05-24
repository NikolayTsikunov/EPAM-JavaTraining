public class WeightConverter {
    public static double convertKgToMg(int kg) {
        return kg * 1_000_000;
    }

    public static double convertKgToG(int kg) {
        return kg * 1_000;
    }

    public static double convertKgToT(int kg) {
        return kg / 1000.0;
    }
}
