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

    public void update(Car newCar) {
        int index;
        for (Car car : carList) {
            if (car.modelName.equalsIgnoreCase(newCar.modelName)) {
                index = carList.indexOf(car);
                carList.add(index, newCar);
            } else {
//                TODO throw error
            }
        }
    }

    public void delete(String name){
        for (Car car : carList) {
            if (car.modelName.equalsIgnoreCase(name)) {
                carList.remove(car);
            }
        }
    }
}
