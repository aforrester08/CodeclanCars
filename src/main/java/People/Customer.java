package People;

import Locations.Garage;
import Vehicles.Car;

import java.util.ArrayList;

public class Customer extends Person {

    private Garage garage;

    public Customer(String name, int wallet) {
        super(name, wallet);
        this.garage = new Garage(5);
    }

    public void buyCar(Car car) {
        garage.addCar(car);
        pay(car.getPrice());
    }

    public ArrayList<Car> getGarage(){
        return garage.getCars();
    }
}
