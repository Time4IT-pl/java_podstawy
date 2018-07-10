package pl.time4it.dzien_2.vehicles;

public class Bike extends Vehicle implements ActionBike{

    private double wheelSize;
    private int gearsNumber;

    public Bike(Color color, int seatNumber, double weight, Fuel fuel, int wheel, double wheelSize, int gearsNumber) {
        super(color, seatNumber, weight, fuel, wheel);
        this.wheelSize = wheelSize;
        this.gearsNumber = gearsNumber;
    }

    public Bike() {}

    public double getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(double wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getGearsNumber() {
        return gearsNumber;
    }

    public void setGearsNumber(int gearsNumber) {
        this.gearsNumber = gearsNumber;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "wheelSize=" + wheelSize +
                ", gearsNumber=" + gearsNumber +
                "} " + super.toString();
    }

    @Override
    public void oneWheelRide() {
        System.out.println("biker rides on one wheel");
    }
}
