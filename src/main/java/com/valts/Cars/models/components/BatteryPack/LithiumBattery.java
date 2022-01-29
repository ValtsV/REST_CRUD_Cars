package com.valts.Cars.models.components.BatteryPack;

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
