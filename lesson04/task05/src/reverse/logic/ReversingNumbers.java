package reverse.logic;

public class ReversingNumbers {

    public static int reverseNumber(int number) {

        int digit = number % 10;
        number /= 10;
        int result = digit;

        digit = number % 10;
        number /= 10;
        result = result * 10 + digit;

        digit = number % 10;
        number /= 10;
        result = result * 10 + digit;

        digit = number % 10;
        number /= 10;
        result = result * 10 + digit;

        digit = number % 10;
        number /= 10;
        result = result * 10 + digit;

        digit = number % 10;
        number /= 10;
        result = result * 10 + digit;

        result = result * 10 + number;

        return result;
    }
}
