package com.valts.Cars.Services;

import com.valts.Cars.Models.Car.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        carList.set(index, newCar);
    }

    public void deleteOne(String name){
        carList.removeIf(car -> car.modelName.equalsIgnoreCase(name));
    }

    public List<Car> searchCars(List<String> names, List<String> modelNames, List<String> colors, List<Integer> doorCounts) {

        return carList.stream().filter(car -> {
            if (names != null) {
                for (String name : names) {
                    return car.name.equalsIgnoreCase(name);
                }
            }
            return true;
        }).filter(car -> {
            if (modelNames != null) {
                for (String modelName : modelNames) {
                    return car.modelName.equalsIgnoreCase(modelName);
                }
            }
            return true;
        }).filter(car -> {
            if (colors != null) {
                for (String color : colors) {
                    return car.color.equalsIgnoreCase(color);
                }
            }
            return true;
        }).filter(car -> {
            if (doorCounts != null) {
                for (Integer doorCount : doorCounts) {
                    return car.doorCount == doorCount;
                }
            }
            return true;
        }).collect(Collectors.toList());
    }
}