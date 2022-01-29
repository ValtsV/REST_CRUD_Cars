package com.valts.Cars.models.car.exceptions;

public class CarException extends Exception{
    public CarException(String message) {
        super("Car Error: " + message);
    }
}
