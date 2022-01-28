package com.valts.Cars.Models.Car;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "name", visible = true)
@JsonSubTypes({@JsonSubTypes.Type(value = ElectricCar.class, name = "electric"),
        @JsonSubTypes.Type(value = GasCar.class, name = "gas"),
        @JsonSubTypes.Type(value = HydrogenCar.class, name = "hydrogen")})

public abstract class Car {

    public String name;
    public String modelName;
    public int doorCount;
    public String color;


    public Car() {
    }

    public Car(String name, String modelName, int doorCount, String color) {
        this.name = name;
        this.modelName = modelName;
        this.doorCount = doorCount;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String type) {
        this.name = type;
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
