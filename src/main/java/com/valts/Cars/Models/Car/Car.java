package com.valts.Cars.Models.Car;

public abstract class Car {
    public String modelName;
    public int doorCount;
    public String color;

    public Car(String modelName, int doorCount, String color) {
        this.modelName = modelName;
        this.doorCount = doorCount;
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
