package com.company.prak2.car;


import java.lang.Math;
public class Van extends Car{
    long basePrice;
    public Van(long basePrice) {
        super(4);
        this.basePrice = basePrice;
    }
    @Override
    public long getPrice() {
        if (this.getMileage() > 10000) {
            return this.basePrice / 2 ;
        }
        if (this.getMileage() > 1000 && this.getMileage() <= 10000) {
            //1000 < mileage <= 10000
            return 3*this.basePrice/4 ;
        }
        return this.basePrice;
    }
}
