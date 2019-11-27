package People;

import Vehicles.Car;

import java.util.ArrayList;

public abstract class Person {

    private String name;
    private int wallet;

    public Person(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return this.wallet;
    }

    public void pay(int amount) {
        wallet -= amount;
    }

}
