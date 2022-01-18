package com.valts.Cars.Models.Car;

import com.valts.Cars.Models.CarComponents.AirInjection.Supercharger;
import com.valts.Cars.Models.CarComponents.FuelTank.PetrolTank;
import com.valts.Cars.Models.CarComponents.Motor.InternalCombustionEngine;

public class GasCar extends Car{

    public Supercharger supercharger;
    public PetrolTank petrolTank;
    public InternalCombustionEngine internalCombustionEngine;

    public GasCar(String modelName, int doorCount, String color, Supercharger supercharger, PetrolTank petrolTank, InternalCombustionEngine internalCombustionEngine) {
        super(modelName, doorCount, color);
        this.supercharger = supercharger;
        this.petrolTank = petrolTank;
        this.internalCombustionEngine = internalCombustionEngine;
    }

    public Supercharger getSupercharger() {
        return supercharger;
    }

    public void setSupercharger(Supercharger supercharger) {
        this.supercharger = supercharger;
    }

    public PetrolTank getPetrolTank() {
        return petrolTank;
    }

    public void setPetrolTank(PetrolTank petrolTank) {
        this.petrolTank = petrolTank;
    }

    public InternalCombustionEngine getInternalCombustionEngine() {
        return internalCombustionEngine;
    }

    public void setInternalCombustionEngine(InternalCombustionEngine internalCombustionEngine) {
        this.internalCombustionEngine = internalCombustionEngine;
    }

    @Override
    public String toString() {
        return "GasCar{" +
                "modelName='" + modelName + '\'' +
                ", doorCount=" + doorCount +
                ", color='" + color + '\'' +
                ", supercharger=" + supercharger +
                ", petrolTank=" + petrolTank +
                ", internalCombustionEngine=" + internalCombustionEngine +
                '}';
    }
}