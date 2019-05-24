package reverse.logic;

public class ParsingNumbers {

    public static int takeDigit(int number, int position) {
        number /= (int)Math.pow(10, position - 1);
        return number % 10;
    }

    public static int putDigit(int result, int number, int position) {
        return result += number * Math.pow(10, position - 1);
    }
}
