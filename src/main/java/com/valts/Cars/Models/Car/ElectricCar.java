package com.valts.Cars.Models.Car;

import com.valts.Cars.Models.CarComponents.BatteryPack.LithiumBattery;
import com.valts.Cars.Models.CarComponents.ElectricConverter.PowerElectronicController;
import com.valts.Cars.Models.CarComponents.Motor.ElectricMotor;

public class ElectricCar extends Car {

    public LithiumBattery lithiumBattery;
    public ElectricMotor electricMotor;
    public PowerElectronicController powerElectronicController;

    public ElectricCar(String modelName, int doorCount, String color, LithiumBattery lithiumBattery, ElectricMotor electricMotor, PowerElectronicController powerElectronicController) {
        super(modelName, doorCount, color);
        this.lithiumBattery = lithiumBattery;
        this.electricMotor = electricMotor;
        this.powerElectronicController = powerElectronicController;
    }

    public LithiumBattery getLithiumBattery() {
        return lithiumBattery;
    }

    public void setLithiumBattery(LithiumBattery lithiumBattery) {
        this.lithiumBattery = lithiumBattery;
    }

    public ElectricMotor getElectricMotor() {
        return electricMotor;
    }

    public void setElectricMotor(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }

    public PowerElectronicController getPowerElectronicController() {
        return powerElectronicController;
    }

    public void setPowerElectronicController(PowerElectronicController powerElectronicController) {
        this.powerElectronicController = powerElectronicController;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "modelName='" + modelName + '\'' +
                ", doorCount=" + doorCount +
                ", color='" + color + '\'' +
                ", lithiumBattery=" + lithiumBattery +
                ", electricMotor=" + electricMotor +
                ", powerElectronicController=" + powerElectronicController +
                '}';
    }
}