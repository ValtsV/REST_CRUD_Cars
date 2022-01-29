package com.valts.Cars.models.components.FuelTank;

public class HydrogenTank extends FuelTank{


    public HydrogenTank(int tankCapacity, boolean isPumping) {
        super(tankCapacity, isPumping);
    }

    @Override
    public String toString() {
        return "HydrogenTank{" +
                "tankCapacity=" + tankCapacity +
                ", isPumping=" + isPumping +
                '}';
    }
}
