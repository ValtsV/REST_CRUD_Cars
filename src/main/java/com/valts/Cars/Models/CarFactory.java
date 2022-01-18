package com.valts.Cars.Models;

import com.valts.Cars.Models.Car.Car;
import com.valts.Cars.Models.Car.CarFacade;
import com.valts.Cars.Models.Car.ElectricCar;
import com.valts.Cars.Models.Car.GasCar;
import com.valts.Cars.Models.CarComponents.AirInjection.Supercharger;
import com.valts.Cars.Models.CarComponents.FuelTank.PetrolTank;
import com.valts.Cars.Models.CarComponents.Motor.InternalCombustionEngine;

public class CarFactory {
    public Car car;


    public CarFactory(String carType) {
        if (carType.equalsIgnoreCase("gas")) {
//            TODO create car calling Facade
                car = new CarFacade().getGasCar("modelname",5,"brown");
        } else if (carType.equalsIgnoreCase("electric")) {
            car = new CarFacade().getElectricCar("modelname", 3, "yellow");
        } else {
            car = new CarFacade().getHybridCar("modelname", 4, "red");
        }


    }


}
