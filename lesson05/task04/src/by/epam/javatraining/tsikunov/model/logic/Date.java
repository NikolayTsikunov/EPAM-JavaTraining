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

        String nextDate;

        if (month == FEBRUARY) {
            nextDate = takeFebruaryDate(day, month, year);
        } else if (day <= 29) {
            nextDate = takeOrdinaryDate(day, month, year);
        } else {
            nextDate = takeDateInTheEndOfMonth(day, month, year);
        }
        return nextDate;
    }

    private static String takeFebruaryDate(int day, int month, int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        String date;
        if ((isLeapYear && day == 29) || (!isLeapYear && day == 28)) {
            date = takeEndOfMonthDate(month, year);
        } else {
            date = takeOrdinaryDate(day, month, year);
        }
        return date;
    }

    private static String takeOrdinaryDate(int day, int month, int year) {
        return ++day + "." + month + "." + year;
    }
    private static String takeEndOfMonthDate(int month, int year) {
        return 1 + "." + ++month + "." + year;
    }

    private static String takeDateInTheEndOfMonth(int day, int month, int year) {
        String date;

        if (day == 30) {
            if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) {
                date = takeEndOfMonthDate(month, year);
            } else {
                date = takeOrdinaryDate(day, month, year);
            }
        } else if (day == 31 && month != DECEMBER) {
            date = takeEndOfMonthDate(month, year);
        } else {
            date = 1 + "." + 1 + "." + ++year;
        }


        return date;
    }

    private static boolean isValidDate(int day, int month, int year) {

        boolean valid = true;

        if (day <= 0 || month <= 0 || day > 31 || month > 12) {
            valid = false;
        } else {
            boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
            if (month == FEBRUARY && ((!isLeapYear && day > 28) || (isLeapYear && day > 29))) {
                valid = false;
            }
            if (day == 31) {
                if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) {
                    valid = false;
                }
            }
        }

        return valid;
    }

}
