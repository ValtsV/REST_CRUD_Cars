package com.valts.Cars.Models.Car;

import com.valts.Cars.Models.CarComponents.AirInjection.Supercharger;
import com.valts.Cars.Models.CarComponents.BatteryPack.LithiumBattery;
import com.valts.Cars.Models.CarComponents.ElectricConverter.PowerElectronicController;
import com.valts.Cars.Models.CarComponents.FuelTank.HydrogenTank;
import com.valts.Cars.Models.CarComponents.Motor.InternalCombustionEngine;

public class HydrogenCar extends Car {

    public Supercharger supercharger;
    public HydrogenTank hydrogenTank;
    public InternalCombustionEngine internalCombustionEngine;
    public LithiumBattery lithiumBattery;
    public PowerElectronicController powerElectronicController;

    public HydrogenCar(String name, String modelName, int doorCount, String color, Supercharger supercharger, HydrogenTank hydrogenTank, InternalCombustionEngine internalCombustionEngine, LithiumBattery lithiumBattery, PowerElectronicController powerElectronicController) {
        super(name, modelName, doorCount, color);
        this.supercharger = supercharger;
        this.hydrogenTank = hydrogenTank;
        this.internalCombustionEngine = internalCombustionEngine;
        this.lithiumBattery = lithiumBattery;
        this.powerElectronicController = powerElectronicController;
    }

    public Supercharger getSupercharger() {
        return supercharger;
    }

    public void setSupercharger(Supercharger supercharger) {
        this.supercharger = supercharger;
    }

    public HydrogenTank getHydrogenTank() {
        return hydrogenTank;
    }

    public void setHydrogenTank(HydrogenTank hydrogenTank) {
        this.hydrogenTank = hydrogenTank;
    }

    public InternalCombustionEngine getInternalCombustionEngine() {
        return internalCombustionEngine;
    }

    public void setInternalCombustionEngine(InternalCombustionEngine internalCombustionEngine) {
        this.internalCombustionEngine = internalCombustionEngine;
    }

    public LithiumBattery getLithiumBattery() {
        return lithiumBattery;
    }

    public void setLithiumBattery(LithiumBattery lithiumBattery) {
        this.lithiumBattery = lithiumBattery;
    }

    public PowerElectronicController getPowerElectronicController() {
        return powerElectronicController;
    }

    public void setPowerElectronicController(PowerElectronicController powerElectronicController) {
        this.powerElectronicController = powerElectronicController;
    }

    @Override
    public String toString() {
        return "HydrogenCar{" +
                "name='" + name + '\'' +
                ", modelName='" + modelName + '\'' +
                ", doorCount=" + doorCount +
                ", color='" + color + '\'' +
                ", supercharger=" + supercharger +
                ", hydrogenTank=" + hydrogenTank +
                ", internalCombustionEngine=" + internalCombustionEngine +
                ", lithiumBattery=" + lithiumBattery +
                ", powerElectronicController=" + powerElectronicController +
                '}';
    }
}
