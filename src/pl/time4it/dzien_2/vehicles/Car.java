package pl.time4it.dzien_2.vehicles;

public class Car extends Vehicle implements ActionCar{
    private double volume;
    private int horsePower;
    private boolean airCondition;

    public Car(Color color, int seatNumber, double weight, Fuel fuel, int wheel, double volume, int horsePower, boolean airCondition) {
        super(color, seatNumber, weight, fuel, wheel);
        this.volume = volume;
        this.horsePower = horsePower;
        this.airCondition = airCondition;
    }

    public void destroy() {
        System.out.println("destory");
    }

    public Car() {}

    @Override
    public String toString() {
        return "Car{" +
                "volume=" + volume +
                ", horsePower=" + horsePower +
                ", airCondition=" + airCondition +
                "} " + super.toString();
    }

    @Override
    public void drift() {
        System.out.println("Car drifting");
    }
}
