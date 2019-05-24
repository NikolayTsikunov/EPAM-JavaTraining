public class Task02 {
    public static void main(String[] args) {

        System.out.println("**** Temperature converter demonstration ****");
        int celsius = 23;
        int fahrenheit = 50;
        int kelvin = 100;

        System.out.printf("\nConvert celsius = %dC to fahrenheit: %.2fF\n",
                celsius, TemperatureConverter.convertCtoF(celsius)
        );
        System.out.printf("\nConvert celsius = %dC to kelvin: %.2fK\n",
                celsius, TemperatureConverter.convertCtoK(celsius)
        );

        System.out.printf("\nConvert fahrenheit = %dF to kelvin: %.2fK\n",
                fahrenheit, TemperatureConverter.convertFtoK(fahrenheit)
        );
        System.out.printf("\nConvert fahrenheit = %dF to celsius: %.2fC\n",
                fahrenheit, TemperatureConverter.convertFtoC(fahrenheit)
        );

        System.out.printf("\nConvert kelvin = %dK to fahrenheit: %.2fF\n",
                kelvin, TemperatureConverter.convertKtoF(kelvin)
        );
        System.out.printf("\nConvert kelvin = %dK to celsius: %.2fC\n",
                kelvin, TemperatureConverter.convertKtoC(kelvin)
        );

        System.out.println("\n**** Weight converter demonstration ****");
        int kg = 1300;
        System.out.printf("\nConvert Kg = %d kg to MiliGram: %.2f mg\n",
                kg, WeightConverter.convertKgToMg(kg)
        );
        System.out.printf("\nConvert Kg = %d kg to Gram: %.2f g\n",
                kg, WeightConverter.convertKgToG(kg)
        );
        System.out.printf("\nConvert Kg = %d kg to Tones: %.2f T\n",
                kg, WeightConverter.convertKgToT(kg)
        );

        System.out.println("\n**** Replacement demonstration ****");
        ReplacementValues.demonstrateReplacement( 10, 6);
    }
}
