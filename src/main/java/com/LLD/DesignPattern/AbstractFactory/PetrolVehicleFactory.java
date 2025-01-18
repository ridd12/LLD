package com.LLD.DesignPattern.AbstractFactory;

public class PetrolVehicleFactory {

    public static Vehicle getVehicle(PriceRange priceRange){
        return switch (priceRange){
            case High -> new Tata();
            case Mid -> new Renault();
            default -> new Tata();
        };
    }

}
