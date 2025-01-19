package com.LLD.DesignParkingLotSystem;

public class FourWheelerParkingSpot extends ParkingSpot{

    FourWheelerParkingSpot(String id){
        super(id);
    }

    @Override
    Integer getPrice(){
        return 200;
    }

}
