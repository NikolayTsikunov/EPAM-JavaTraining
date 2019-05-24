public class Task01 {
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
    }
}
