package com.valts.Cars.models;

import com.valts.Cars.models.car.Car;
import com.valts.Cars.models.car.exceptions.CarException;
import com.valts.Cars.models.car.exceptions.CarTypeException;
import com.valts.Cars.models.car.CarFacade;

public class CarFactory {
    public Car car;


    public CarFactory(String carType, Car carObject) throws CarException {
        if (carType.equalsIgnoreCase("gas")) {
                car = new CarFacade().getGasCar(carObject.name, carObject.modelName,carObject.doorCount,carObject.color);
        } else if (carType.equalsIgnoreCase("electric")) {
            car = new CarFacade().getElectricCar(carObject.name, carObject.modelName,carObject.doorCount,carObject.color);
        } else if (carType.equalsIgnoreCase("hydrogen")) {
            car = new CarFacade().getHydrogen(carObject.name, carObject.modelName,carObject.doorCount,carObject.color);
        } else {
            throw new CarTypeException(carType);
        }


    }


}
