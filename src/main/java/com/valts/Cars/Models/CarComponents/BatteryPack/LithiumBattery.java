package com.valts.Cars.Models.CarComponents.BatteryPack;

public class LithiumBattery extends BatteryPack {

    public LithiumBattery(int capacity, boolean isConnected) {
        super(capacity, isConnected);
    }

    @Override
    public String toString() {
        return "LithiumBattery{" +
                "capacity=" + capacity +
                ", isConnected=" + isConnected +
                '}';
    }
}
