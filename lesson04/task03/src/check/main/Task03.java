package check.main;

import check.logic.Digits;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("**** Demonstration of program ****");

        int numberOne = 1234;
        int numberTwo = 5432;
        int numberThree = 5462;

        System.out.printf("Are digits of %d rise: %b\n", numberOne, Digits.isDigitsRise(numberOne));

        System.out.printf("Are digits of %d decrease: %b\n", numberTwo, Digits.isDigitsDecrease(numberTwo));

        System.out.printf("Are digits of %d rise: %b\n", numberThree, Digits.isDigitsRise(numberThree));
    }
}
