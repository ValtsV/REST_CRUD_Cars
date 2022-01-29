package com.valts.Cars.controllers;

import com.valts.Cars.models.car.Car;
import com.valts.Cars.models.car.exceptions.CarException;
import com.valts.Cars.models.car.exceptions.CarTypeException;
import com.valts.Cars.models.car.exceptions.DuplicateCarException;
import com.valts.Cars.models.CarFactory;
import com.valts.Cars.services.CarService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Path("/")
public class CarController {
    private final CarService carService;
    private final String URL = "http://localhost:";
    private final String PORT = "8080";
    Logger logger = Logger.getLogger("ControllerLogger");

    public CarController(CarService carService) {
        this.carService = carService;
    }

//    GET ALL

    @GET
    @Path("/cars")
    @Produces("application/json")
    public Response getAll() {
        return Response.status(Response.Status.OK).entity(carService.getAll()).build();
    }

//    GET ONE

    @GET
    @Path("/cars/{carName}")
    @Produces("application/json")
    public Response getOne(@PathParam("carName") String name) {
        System.out.println(carService.getOne(name));
        return Response.status(Response.Status.OK).entity(carService.getOne(name)).build();
    }

//    POST

    @POST
    @Path("/cars/{carType}")
    @Produces("application/json")
    @Consumes("application/json")
    public Response add(@PathParam("carType") String carType, Car car) throws CarException {
        try {
            CarFactory carFactory = new CarFactory(carType, car);
            carService.add(carFactory.car);
        } catch (CarTypeException | DuplicateCarException e) {
            logger.log(Level.INFO, e.getMessage());
            return Response.status(404).entity(e.getMessage()).build();
        }
        return Response.created(URI.create(URL + PORT + car.modelName)).build();
    }

    //    PUT
    @PUT
    @Path("/cars/{modelName}")
    @Produces("application/json")
    @Consumes("application/json")
    public Response update(Car car, @PathParam("modelName") String modelName) {
        carService.update(modelName, car);
        return Response.created(URI.create(URL + PORT + car.modelName)).build();
    }

    //    DELETE ONE
    @DELETE
    @Path("/cars/{modelName}")
    @Produces("application/json")
    public Response deleteOne(@PathParam("modelName") String modelName) {
        carService.deleteOne(modelName);
        return Response.status(Response.Status.OK).entity(carService.getAll()).build();
    }

//    DELETE ALL

    @DELETE
    @Path("/cars")
    public Response deleteAll() {
        return Response.status(Response.Status.OK).build();
    }


//    SEARCH

    @GET
    @Path("cars/search")
    @Produces("application/json")
    public Response searchCars(@QueryParam("color") List<String> color,
                               @QueryParam("name") List<String> name,
                               @QueryParam("doorcount") List<Integer> doorCount,
                                   @QueryParam("modelname") List<String> modelName){

        List<Car> carList = carService.searchCars(name, modelName, color, doorCount);
        if (carList.isEmpty()) {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        return Response.status(Response.Status.OK).entity(carList).build();
    }


}
