package com.valts.Cars.models.components.ElectricConverter;

public abstract class ElectricConverter {
    public boolean isConverting;

    public ElectricConverter(boolean isConverting) {
        this.isConverting = isConverting;
    }

    public void startConverting() {
        this.isConverting = true;
    }

    public void stopConverting() {
        this.isConverting = false;
    }

    public boolean isConverting() {
        return isConverting;
    }

    public void setConverting(boolean converting) {
        isConverting = converting;
    }


}
