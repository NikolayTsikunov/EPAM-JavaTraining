package by.epam.javatraining.tsikunov.model.entity;

public class SpeedTaxi extends Taxi {
    private int averageSpeed;

    public SpeedTaxi() {
        super();
        this.averageSpeed = 90;
    }

    public SpeedTaxi(String name, int cost, int seats, int averageSpeed, int dayFuel) {
        super(name, cost, seats, dayFuel);
        this.averageSpeed = averageSpeed;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
}
