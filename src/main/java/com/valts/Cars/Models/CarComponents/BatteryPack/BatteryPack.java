package com.valts.Cars.Models.CarComponents.BatteryPack;

abstract public class BatteryPack {
    public int capacity;
    public boolean isConnected;

    public BatteryPack(int capacity, boolean isConnected) {
        this.capacity = capacity;
        this.isConnected = isConnected;
    }

    public void connectBattery() { this.isConnected = true;
    }

    public void disconnectBattery() { this.isConnected = false;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }


}
