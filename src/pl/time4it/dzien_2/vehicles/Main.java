package pl.time4it.dzien_2.vehicles;


public class Main {

    public static void main(String[] args) {
        Vehicle car =
                new Car(Vehicle.Color.BLACK,
                        5,
                        2.340,
                        Vehicle.Fuel.DIESEL,
                        4,
                        3.4,
                        320,
                        true);

        car.ride();
        car.turn();
        car.stop();
        ((Car) car).destroy();
        System.out.println(car);

        System.out.println(); //odstep

        Vehicle bike = new Bike();
        bike.stop();

        ((Bike) bike).oneWheelRide();
        ((Car) car).drift();
        car.createVehicle();







    }

}
