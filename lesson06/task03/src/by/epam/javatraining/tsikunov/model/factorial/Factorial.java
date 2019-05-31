package by.epam.javatraining.tsikunov.model.factorial;

public class Factorial {
    public static int countFactorial(int number) {

        if(number < 0) {
            return -1;
        }

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }
}
