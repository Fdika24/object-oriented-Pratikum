package com.company.prak2.car;

public class Bus extends Car{

    int maxCapacity;

    public Bus(int maxCapacity) {
        super(6);
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    @Override
    public String toString() {
        String newStr = String.format(
                "Number of Wheels: %d, Mileage: %d, Max Capacity: %d"
                ,this.getNumberOfWheels()
                ,this.getMileage()
                ,this.getMaxCapacity());
        return newStr;
    }
    @Override
    public long getPrice() {
        if (this.getMileage() >= 0 && this.getMileage() <= 10000){ //0 <= mileage <= 10000
            return 1000000 * maxCapacity;
        }
        return 500000 * maxCapacity;
    }
}
