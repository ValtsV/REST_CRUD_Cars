package com.valts.Cars.models.components.ElectricConverter;

public class PowerElectronicController extends ElectricConverter{

    public PowerElectronicController(boolean isConverting) {
        super(isConverting);
    }

    @Override
    public String toString() {
        return "PowerElectronicController{" +
                "isConverting=" + isConverting +
                '}';
    }
}
