package by.epam.javatraining.tsikunov.model.numbers;

public class Digits {

    //Unfortunately, I don't know how to get rid from code-duplicate

    public static boolean isRise(int number) {
        boolean rise = true;
        int digit = number % 10;
        number /= 10;

        while(number > 0) {
            int nextDigit = number % 10;
            if(digit > nextDigit) {
                digit = nextDigit;
                number /= 10;
            } else {
                rise = false;
                break;
            }
        }

        return rise;
    }

    public static boolean isDown(int number) {
        boolean down = true;
        int digit = number % 10;
        number /= 10;

        while(number > 0) {
            int nextDigit = number % 10;
            if(digit < nextDigit) {
                digit = nextDigit;
                number /= 10;
            } else {
                down = false;
                break;
            }
        }
        return down;
    }
}
