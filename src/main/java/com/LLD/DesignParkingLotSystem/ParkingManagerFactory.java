package com.LLD.DesignParkingLotSystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingManagerFactory {

    List<ParkingSpot> listFourWheelerParking=new ArrayList<>();
    List<ParkingSpot> listTwoWheelerParking=new ArrayList<>();


    public ParkingManager getParkingManagerFactory(Vehicle vehicle){
        return switch (vehicle.vehicleType){
            case Four_Wheeler -> new FourWheelerParkingManager(listFourWheelerParking,new FourWheelerParkingStrategy());
            case Two_Wheeler -> new TwoWheelerParkingManager(listTwoWheelerParking,new TwoWheelerParkingStrategy());
        };
    }

}
