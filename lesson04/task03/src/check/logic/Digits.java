package check.logic;

public class Digits {
    public static boolean isDigitsRise(int one, int two, int three, int four) {
        return one < two && two < three && three < four;
    }

    public static boolean isDigitsDecrease(int one, int two, int three, int four) {
        return one > two && two > three && three > four;
    }
}
