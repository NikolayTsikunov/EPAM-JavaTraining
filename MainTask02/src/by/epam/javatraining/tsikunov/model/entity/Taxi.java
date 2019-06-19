package by.epam.javatraining.tsikunov.model.entity;


public class Taxi {

    private String name;
    private int cost;
    private int seats;
    private int dayFuel;

    public Taxi() {
        this.name = "standard taxi";
        this.cost = 1000;
        this.seats = 3;
        this.dayFuel = 30;
    }

    public Taxi(String name, int cost, int seats, int dayFuel) {
        this.name = name;
        this.cost = cost;
        this.seats = seats;
        this.dayFuel = dayFuel;
    }

    public int getDayFuel() {
        return dayFuel;
    }

    public void setDayFuel(int totalFuel) {
        this.dayFuel = totalFuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
