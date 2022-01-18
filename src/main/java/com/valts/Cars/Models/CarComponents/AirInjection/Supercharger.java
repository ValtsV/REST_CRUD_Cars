package com.valts.Cars.Models.CarComponents.AirInjection;

public class Supercharger extends AirInjection{


    public Supercharger(boolean valveOpen, Double boostRate) {
        super(valveOpen, boostRate);
    }

    @Override
    public String toString() {
        return "Supercharger{" +
                "valveOpen=" + valveOpen +
                ", boostRate=" + boostRate +
                '}';
    }
}


