package com.valts.Cars.Models.CarComponents.AirInjection;

abstract public class AirInjection {
    public boolean valveOpen;
    public Double boostRate;

    public AirInjection(boolean valveOpen, Double boostRate) {
        this.valveOpen = valveOpen;
        this.boostRate = boostRate;
    }

    public void openValve() {
        this.valveOpen = true;
    }

    public void closeValve() {
        this.valveOpen = false;
    }

    public boolean isValveOpen() {
        return valveOpen;
    }

    public void setValveOpen(boolean valveOpen) {
        this.valveOpen = valveOpen;
    }

    public Double getBoostRate() {
        return boostRate;
    }

    public void setBoostRate(Double boostRate) {
        this.boostRate = boostRate;
    }

}
