package by.epam.javatraining.tsikunov.model.logic;

public class Date {

    final private static int FEBRUARY = 2;
    final private static int APRIL = 4;
    final private static int JUNE = 6;
    final private static int SEPTEMBER = 9;
    final private static int NOVEMBER = 11;
    final private static int DECEMBER = 12;


    public static String takeNextDate(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            return "Wrong date";
        }

        if (month == FEBRUARY) {
            return takeFebruaryDate(day, month, year);
        }

        if (day <= 29) {
            return takeOrdinaryDate(day, month, year);
        }

        return takeDateInTheEndOfMonth(day, month, year);
    }

    private static String takeFebruaryDate(int day, int month, int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if ((isLeapYear && day == 29) || (!isLeapYear && day == 28)) {
            return 1 + "." + ++month + "." + year;
        } else {
            return ++day + "." + month + "." + year;
        }
    }

    private static String takeOrdinaryDate(int day, int month, int year) {
        return ++day + "." + month + "." + year;
    }

    private static String takeDateInTheEndOfMonth(int day, int month, int year) {
        if (day == 30) {
            if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) {
                return 1 + "." + ++month + "." + year;
            } else {
                return ++day + "." + month + "." + year;
            }
        }

        if (day == 31 && month != DECEMBER) {
            return 1 + "." + ++month + "." + year;
        } else {
            return 1 + "." + 1 + "." + ++year;
        }
    }

    private static boolean isValidDate(int day, int month, int year) {

        boolean valid = true;

        if (day <= 0 || month <= 0) {
            valid = false;
        }


        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (month == FEBRUARY && (!isLeapYear && day > 28) && (isLeapYear && day > 29)) {
            valid = false;
        }

        if (day == 31) {
            if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) {
                valid = false;
            }
        }

        return valid;
    }

}
