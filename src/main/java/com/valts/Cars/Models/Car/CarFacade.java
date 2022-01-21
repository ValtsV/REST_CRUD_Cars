package com.valts.Cars.Models.Car;

import com.valts.Cars.Models.CarComponents.AirInjection.Supercharger;
import com.valts.Cars.Models.CarComponents.BatteryPack.LithiumBattery;
import com.valts.Cars.Models.CarComponents.ElectricConverter.PowerElectronicController;
import com.valts.Cars.Models.CarComponents.FuelTank.HydrogenTank;
import com.valts.Cars.Models.CarComponents.FuelTank.PetrolTank;
import com.valts.Cars.Models.CarComponents.Motor.ElectricMotor;
import com.valts.Cars.Models.CarComponents.Motor.InternalCombustionEngine;

public class CarFacade {

    public Car getGasCar(String name, String modelName, int doorCount, String color){
        Supercharger supercharger = new Supercharger(true, 2d);
        PetrolTank petrolTank = new PetrolTank(50, true);
        InternalCombustionEngine ice = new InternalCombustionEngine("SR20", true, 233);
        return new GasCar(name, modelName, doorCount, color, supercharger, petrolTank, ice);
    }

    public Car getHybridCar(String name, String modelName, int doorCount, String color){
        Supercharger supercharger = new Supercharger(true, 2d);
        HydrogenTank hydrogenTank = new HydrogenTank(50, true);
        InternalCombustionEngine ice = new InternalCombustionEngine("f22", true, 245);
        LithiumBattery lithiumBattery = new LithiumBattery(100, true);
        PowerElectronicController pec = new PowerElectronicController(true);
        return new HydrogenCar(name, modelName, doorCount, color, supercharger, hydrogenTank, ice, lithiumBattery, pec);
    }

    public Car getElectricCar(String name, String modelName, int doorCount, String color) {
        LithiumBattery lithiumBattery = new LithiumBattery(230, true);
        PowerElectronicController pec = new PowerElectronicController(true);
        ElectricMotor electricMotor = new ElectricMotor("motorname", true, 130);
        return new ElectricCar(name, modelName, doorCount, color, lithiumBattery, electricMotor, pec);
    }


}
