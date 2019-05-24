public class TemperatureConverter {
    public static double convertCtoF(int celsius) {
        return celsius * 9 / 5.0 + 32;
    }

    public static double convertCtoK(int celsius) {
        return celsius + 273.15;
    }

    public static double convertFtoC(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9.0;
    }

    public static double convertFtoK(int fahrenheit) {

        return (fahrenheit - 32) * 5 / 9.0 + 273.15;
    }

    public static double convertKtoC(int kelvin) {

        return kelvin - 273.15;
    }

    public static double convertKtoF(int kelvin) {

        return (kelvin - 273.15) * 9 / 5.0 + 32;
    }
}
