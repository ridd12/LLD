package com.LLD.DesignPattern.AbstractFactory;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle=VehicleFactory.getVehicle(VehicleType.Electric,PriceRange.High);
        vehicle.getVehicleName();

        Vehicle vehicle1=VehicleFactory.getVehicle(VehicleType.Petrol,PriceRange.Mid);
        vehicle1.getVehicleName();

    }
}
