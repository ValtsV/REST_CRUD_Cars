package com.valts.Cars.Services;

import com.valts.Cars.Models.Car.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarService {
//    db


    private ArrayList<Car> carList = new ArrayList<>();

//    crud

    public void add(Car car) {

        carList.add(car);
    }

    public Car getOne(String name) {
        for (Car car : carList) {
            if (car.modelName.equalsIgnoreCase(name)) {
                return car;
            }
        }
        return null;
    }

    public ArrayList<Car> getAll(){
        return carList;
    }

    public void update(String modelName, Car newCar) {
        int index = 0;
        for (Car car : carList) {
            if (car.modelName.equalsIgnoreCase(modelName)) {
                index = carList.indexOf(car);

            } else {
//                TODO throw error
            }
        }
        carList.add(index, newCar);
    }

    public void deleteOne(String name){
        for (Car car : carList) {
            if (car.modelName.equalsIgnoreCase(name)) {
                carList.remove(car);
            }
        }
    }
}
