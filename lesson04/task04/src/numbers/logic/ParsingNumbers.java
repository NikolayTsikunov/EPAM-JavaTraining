package numbers.logic;

public class ParsingNumbers {

    public static int takeDigit(int number, int position) {

        number /= (int) Math.pow(10, position - 1);

        return number % 10;
    }
}
