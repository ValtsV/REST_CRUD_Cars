package com.valts.Cars.Models.CarComponents.Motor;

public class ElectricMotor extends Motor {
    public int kWh;

    public ElectricMotor(String motorName, boolean engineOn, int kWh) {
        super(motorName, engineOn);
        this.kWh = kWh;
    }

    public int getkWh() {
        return kWh;
    }

    public void setkWh(int kWh) {
        this.kWh = kWh;
    }

    @Override
    public String toString() {
        return "ElectricMotor{" +
                "kWh=" + kWh +
                ", motorName='" + motorName + '\'' +
                ", engineOn=" + engineOn +
                '}';
    }
}
