package com.valts.Cars.models.car;

import com.valts.Cars.models.components.BatteryPack.LithiumBattery;
import com.valts.Cars.models.components.ElectricConverter.PowerElectronicController;
import com.valts.Cars.models.components.Motor.ElectricMotor;


//@JsonTypeName("electric")
public class ElectricCar extends Car {

    public LithiumBattery lithiumBattery;
    public ElectricMotor electricMotor;
    public PowerElectronicController powerElectronicController;



        public ElectricCar(String name, String modelName, int doorCount, String color, LithiumBattery lithiumBattery, ElectricMotor electricMotor, PowerElectronicController powerElectronicController) {
        super(name ,modelName, doorCount, color);
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
                "name='" + name + '\'' +
                ", modelName='" + modelName + '\'' +
                ", doorCount=" + doorCount +
                ", color='" + color + '\'' +
                ", lithiumBattery=" + lithiumBattery +
                ", electricMotor=" + electricMotor +
                ", powerElectronicController=" + powerElectronicController +
                '}';
    }
}
