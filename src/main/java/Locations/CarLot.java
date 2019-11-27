package Locations;

import People.Customer;
import People.Salesman;
import Vehicles.Car;

import java.util.ArrayList;

public class CarLot {

    private String name;
    private ArrayList<Car> cars;
    private Salesman salesman;
    private ArrayList<Customer> customers;
    private int vault;

    public CarLot(String name, Salesman salesman) {
        this.name = name;
        this.salesman = salesman;
        this.cars = new ArrayList<Car>();
        this.customers = new ArrayList<Customer>();
        this.vault = 500;
    }

    public void addCarToLot(Car car) {
        cars.add(car);
    }

    public void customerArrives(Customer customer) {
        customers.add(customer);
    }

    public ArrayList getCars() {
        return cars;
    }

    public int getVault() {
        return vault;
    }

    public void sellCar(Car car, Customer customer) {
        if (customer.getWallet() > car.getPrice()) {
            cars.remove(car);
            vault += car.getPrice();
            customer.buyCar(car);
        }
    }
}
