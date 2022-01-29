package com.valts.Cars.services;

import com.valts.Cars.models.car.Car;
import com.valts.Cars.models.car.exceptions.CarException;
import com.valts.Cars.models.car.exceptions.DuplicateCarException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
//    db
    private final ArrayList<Car> CAR_LIST = new ArrayList<>();

//    crud

    public void add(Car newCar) throws CarException {

        for (Car car : CAR_LIST) {
            if (car.modelName.equalsIgnoreCase(newCar.modelName)) {
                throw new DuplicateCarException(newCar.modelName);
            }
        }
        CAR_LIST.add(newCar);

    }

    public Car getOne(String name) {
        for (Car car : CAR_LIST) {
            if (car.modelName.equalsIgnoreCase(name)) {
                return car;
            }
        }
        return null;
    }

    public ArrayList<Car> getAll(){
        return CAR_LIST;
    }

    public void update(String modelName, Car newCar) {
        int index = -1;
        for (Car car : CAR_LIST) {
            if (car.modelName.equalsIgnoreCase(modelName)) {
                index = CAR_LIST.indexOf(car);
            }
        }
        if (index > 0) {
            CAR_LIST.set(index, newCar);
        } else {
            CAR_LIST.add(newCar);
        }

    }

    public void deleteOne(String name){
        CAR_LIST.removeIf(car -> car.modelName.equalsIgnoreCase(name));
    }

    public List<Car> searchCars(List<String> names, List<String> modelNames, List<String> colors, List<Integer> doorCounts) {

        return CAR_LIST.stream().filter(car -> {
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