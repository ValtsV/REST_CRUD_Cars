package com.valts.Cars.Models;

import com.valts.Cars.Models.Car.Car;
import com.valts.Cars.Models.Car.CarFacade;

public class CarFactory {
    public Car car;


    public CarFactory(String carType, Car carObject) {
        if (carType.equalsIgnoreCase("gas")) {
                car = new CarFacade().getGasCar(carObject.name, carObject.modelName,carObject.doorCount,carObject.color);
        } else if (carType.equalsIgnoreCase("electric")) {
            car = new CarFacade().getElectricCar(carObject.name, carObject.modelName,carObject.doorCount,carObject.color);
        } else {
            car = new CarFacade().getHybridCar(carObject.name, carObject.modelName,carObject.doorCount,carObject.color);

        }


    }


}
