package Locations;

import Vehicles.Car;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Car> cars;
    private int capacity;

    public Garage(int capacity) {
        this.capacity = capacity;
        this.cars = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        cars.add(car);
        capacity -= 1;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
