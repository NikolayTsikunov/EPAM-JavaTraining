package check.logic;

public class Digits {
    public static boolean isDigitsRise(int one, int two, int three, int four) {

        boolean equals = false;

        if(one < two && two < three && three < four) {
            equals = true;
        }

        return equals;
    }

    public static boolean isDigitsDecrease(int one, int two, int three, int four) {

        boolean equals = false;

        if(one > two && two > three && three > four) {
            equals = true;
        }

        return equals;
    }
}
