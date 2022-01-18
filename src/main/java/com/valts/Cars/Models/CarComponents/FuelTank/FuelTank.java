package com.valts.Cars.Models.CarComponents.FuelTank;

abstract public class FuelTank {
    public int tankCapacity;
    public boolean isPumping = false;

    public FuelTank(int tankCapacity, boolean isPumping) {
        this.tankCapacity = tankCapacity;
        this.isPumping = isPumping;
    }

    public void startPumping() {
        this.isPumping = true;
    }

    public void stopPumping() {
        this.isPumping = false;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public boolean isPumping() {
        return isPumping;
    }

    public void setPumping(boolean pumping) {
        isPumping = pumping;
    }


}
