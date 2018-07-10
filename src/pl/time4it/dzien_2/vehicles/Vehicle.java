package pl.time4it.dzien_2.vehicles;

public class Vehicle implements Actions {

    private Color color;
    private int seatNumber;
    private double weight;
    private Fuel fuel;
    private int wheel;

    public Vehicle(Color color, int seatNumber, double weight, Fuel fuel, int wheel) {
        this.color = color;
        this.seatNumber = seatNumber;
        this.weight = weight;
        this.fuel = fuel;
        this.wheel = wheel;
    }

    public Vehicle() {
    }

    @Override
    public void ride() {
        System.out.println("vehicle rides");
    }

    @Override
    public void turn() {
        System.out.println("vehicle turn left");
    }

    @Override
    public void stop() {
        System.out.println("vehicle stop");

    }

    @Override
    public void horn() {
        System.out.println("vehicle horn");

    }

    @Override
    public void createVehicle() {
        System.out.println("vehicle is created");
    }

    enum Fuel {
        DIESEL, GAS, LPG, OTHER
    }


    enum Color {
        WHITE, BLACK, YELLOW, GREEN, BLUE, BROWN
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color=" + color +
                ", seatNumber=" + seatNumber +
                ", weight=" + weight +
                ", fuel=" + fuel +
                ", wheel=" + wheel +
                '}';
    }
}
