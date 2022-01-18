package com.valts.Cars.Models.CarComponents.Motor;

abstract public class Motor {
    public String motorName;
    public boolean engineOn;

    public Motor(String motorName, boolean engineOn) {
        this.motorName = motorName;
        this.engineOn = engineOn;
    }

    public void turnOn() {
        this.engineOn = true;
    }

    public void turnOff() { this.engineOn = false;
    }

    public String getMotorName() {
        return motorName;
    }

    public void setMotorName(String motorName) {
        this.motorName = motorName;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }


}
