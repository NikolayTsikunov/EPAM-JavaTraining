package by.epam.javatraining.tsikunov.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Test
    public void takeNextDateLeap() {

        String expected = "1.3.2000";
        assertEquals("Wrong date", expected, Date.takeNextDate(29, 2, 2000));
    }

    @Test
    public void takeNextDateNotLeapGood() {

        String expected = "1.3.2001";
        assertEquals("Wrong date", expected, Date.takeNextDate(28, 2, 2001));
    }

    @Test
    public void takeNextDateOrdinaryDate() {

        String expected = "27.6.2010";
        assertEquals("Wrong date", expected, Date.takeNextDate(26, 6, 2010));
    }

    @Test
    public void takeNextDateOrdinaryDateEndOfMonth() {

        String expected = "1.5.2010";
        assertEquals("Wrong date", expected, Date.takeNextDate(30, 4, 2010));
    }
    @Test
    public void takeNextDateOrdinaryDatEndOfYear() {

        String expected = "1.1.2011";
        assertEquals("Wrong date", expected, Date.takeNextDate(31, 12, 2010));
    }

    @Test
    public void takeNextDateNotLeapBad() {

        String expected = "Wrong date";
        assertEquals("Wrong date", expected, Date.takeNextDate(29, 2, 2001));
    }

    @Test
    public void takeNextDateWrongDate() {

        String expected = "Wrong date";
        assertEquals("Wrong date", expected, Date.takeNextDate(-5, -10, 2001));
    }

}