public class Task03 {
    public static void main(String[] args) {

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

    }
}
