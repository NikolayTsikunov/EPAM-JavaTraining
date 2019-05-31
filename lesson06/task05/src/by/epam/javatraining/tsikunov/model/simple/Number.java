package by.epam.javatraining.tsikunov.model.simple;

public class Number {
    public static boolean isSimple(int number) {
        boolean simple = true;
        for (int i = 2; i < number; i++) {
            if(number % i == 0) {
                simple = false;
                break;
            }
        }
        return simple;
    }
}
