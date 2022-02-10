package com.company.prak2.car;

public class Truck extends Car {
    Boolean loaded = false;

    public Truck(int numberOfWheels, Boolean loaded)
    {
        super(numberOfWheels);
        this.loaded = loaded;
    }

    public Boolean isLoaded() {
        return this.loaded;
    }

    public void load() {
        this.loaded = true;
    }

    public void unload() {
        this.loaded = false;
    }

    public String toString() {
        String newStr = String.format(
                "Number of Wheels: %d, Mileage: %d, Is Loaded: %b"
                ,this.getNumberOfWheels()
                ,this.getMileage()
                ,this.isLoaded());
        return newStr;
    }

    @Override
    public long getPrice() {
        return  5000000 * this.getNumberOfWheels();
    }
}
