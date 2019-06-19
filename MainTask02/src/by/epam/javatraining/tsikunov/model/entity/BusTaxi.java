package by.epam.javatraining.tsikunov.model.entity;

public class BusTaxi extends Taxi {
    private int additionalSeats;

    public BusTaxi() {
        this.additionalSeats = 6;
    }

    public BusTaxi(String name, int cost, int seats, int additionalSeats, int dayFuel) {
        super(name, cost, seats, dayFuel);
        this.additionalSeats = additionalSeats;
    }

    public int getAdditionalSeats() {
        return additionalSeats;
    }

    public void setAdditionalSeats(int additionalSeats) {
        this.additionalSeats = additionalSeats;
    }
}
