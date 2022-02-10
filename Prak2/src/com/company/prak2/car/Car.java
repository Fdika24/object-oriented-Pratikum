package com.company.prak2.car;

/**
 * Car.java
 * [sesuai spek saja]
 * @author [18220015] [Farhandika]
 */

public abstract class Car {
    private int numberOfWheels;
    private long mileage;

    public Car(int numberOfWheels) {
        // Konstruktor, set mileage = 0
        this.numberOfWheels = numberOfWheels;
        this.mileage = 0;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public long getMileage() {
        return this.mileage;
    }

    public void increaseMileage(long increment) {
       this.mileage += increment;
    }

    public String toString() {
        String newStr = String.format("Number of Wheels: %d, Mileage: %d",
                this.getNumberOfWheels(),
                this.getMileage());
        // Mengembalikan informasi mobil dengan format: "Number of Wheels: {numberOfWheels}, Mileage: {mileage}"
        return newStr;
    }

    public abstract long getPrice();
}
