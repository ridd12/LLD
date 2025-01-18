package com.LLD.DesignPattern.AbstractFactory;

public class ElectricVehicleFactory {

    public static Vehicle getVehicle(PriceRange priceRange){
        return switch (priceRange){
            case High -> new Tesla();
            case Mid -> new BYD();
            default -> new Tesla();
        };
    }

}
