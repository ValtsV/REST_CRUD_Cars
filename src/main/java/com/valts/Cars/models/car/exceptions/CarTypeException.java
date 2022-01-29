package com.valts.Cars.models.car.exceptions;

public class CarTypeException extends CarException{
    public CarTypeException(String message) {
        super("Can't create car with type: " + message);
    }
}
