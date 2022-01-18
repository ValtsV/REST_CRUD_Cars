package com.valts.Cars.Models.CarComponents.FuelTank;

public class PetrolTank extends FuelTank{


    public PetrolTank(int tankCapacity, boolean isPumping) {
        super(tankCapacity, isPumping);
    }

    @Override
    public String toString() {
        return "PetrolTank{" +
                "tankCapacity=" + tankCapacity +
                ", isPumping=" + isPumping +
                '}';
    }
}

