package reverse.main;

import reverse.logic.ReversingNumbers;

public class Task05 {
    public static void main(String[] args) {
        int number = 8543297;
        int reversedNumber = ReversingNumbers.reverseNumber(number);

        System.out.println("**** Demonstration of reversation ****");

        System.out.printf("The prime number is %d\n", number);

        System.out.printf("The reversed number is %d\n", reversedNumber);
    }
}
