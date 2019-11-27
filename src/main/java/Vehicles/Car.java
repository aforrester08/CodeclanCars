package Vehicles;

public abstract class Car implements IDrive {

    private String name;
    private String model;
    private int speed;
    private int price;

    public Car(String name, String model, int speed, int price) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }


}
