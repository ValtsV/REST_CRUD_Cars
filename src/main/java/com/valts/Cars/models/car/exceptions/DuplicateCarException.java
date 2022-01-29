package com.valts.Cars.models.car.exceptions;

public class DuplicateCarException extends CarException {
    public DuplicateCarException(String message){
        super("Car with model name " + message + " already exists");
    }
}
