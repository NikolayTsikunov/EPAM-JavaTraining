package by.epam.javatraining.tsikunov.model.entity;

import org.apache.log4j.Logger;

public class TaxiPark {
    private static final Logger LOGGER = Logger.getRootLogger();
    private Taxi[] taxis;
    private int totalPlaces;
    private int dailyFuel;
    private int storageFuel;

    public TaxiPark(int totalPlaces, int storageFuel, int currentTaxis) {
        this.totalPlaces = totalPlaces;
        this.storageFuel = storageFuel;
        if(currentTaxis <= totalPlaces) {
            taxis = new Taxi[currentTaxis];
        } else {
            LOGGER.warn("Can't create park with " + currentTaxis + " taxis");
            taxis = new Taxi[totalPlaces];
        }
    }
}
