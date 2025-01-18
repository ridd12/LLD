package com.LLD.DesignPattern.AbstractFactory;

public class VehicleFactory {

    public static Vehicle getVehicle(VehicleType vehicleType,PriceRange priceRange){

        return switch (vehicleType){
            case Electric -> ElectricVehicleFactory.getVehicle(priceRange);
            case CNG -> null;
            case Petrol -> PetrolVehicleFactory.getVehicle(priceRange);
        };

    }

}
