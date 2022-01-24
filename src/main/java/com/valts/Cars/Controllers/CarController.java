package com.valts.Cars.Controllers;

import com.valts.Cars.Models.Car.Car;
import com.valts.Cars.Models.CarFactory;
import com.valts.Cars.Services.CarService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class CarController {
    private final CarService carService;
    private final String URL = "http://localhost:";
    private final String PORT = "8080";

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
        return Response.status(Response.Status.OK).entity(carService.getOne(name)).build();
    }

//    POST

    @POST
    @Path("/cars/{carType}")
    @Produces("application/json")
    @Consumes("application/json")
    public Response add(@PathParam("carType") String carType, Car car) {
        System.out.println(car);
//        TODO check if modelName exists already
        CarFactory carFactory = new CarFactory(carType, car);
        carService.add(carFactory.car);
        return Response.created(URI.create(URL + PORT + car.modelName)).build();
    }

    //    PUT
    @PUT
    @Path("/cars/{modelName}")
    @Produces("application/json")
    @Consumes("application/json")
    public Response update(Car car, @PathParam("modelName") String modelName) {
        System.out.println(car);
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

}
