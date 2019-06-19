package by.epam.javatraining.tsikunov.view.printer;

import org.apache.log4j.Logger;

public class Printer {
    private static final Logger LOGGER = Logger.getRootLogger();

    public static void print(String str) {
        LOGGER.info(str);
    }

}
