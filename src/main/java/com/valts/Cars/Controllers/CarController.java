package com.valts.Cars.Controllers;

import com.valts.Cars.Models.Car.Car;
import com.valts.Cars.Models.CarFactory;
import com.valts.Cars.Services.CarService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import java.util.List;

@Component
@Path("/")
public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GET
    @Path("/cars")
    @Produces("application/json")
    public List<Car> getAll() {
        return carService.getAll();
    }

    @GET
    @Path("/cars/{carName}")
    @Produces("application/json")
    public Car getOne(@PathParam("carName") String name) {
        return carService.getOne(name);
    }

    @POST
    @Path("/cars/{carType}")
    @Produces("application/json")
    @Consumes("application/json")
    public void add(@PathParam("carType") String carType, Car car) {
        CarFactory carFactory = new CarFactory(carType, car);
        carService.add(carFactory.car);
    }

}
