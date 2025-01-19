package com.LLD.DesignParkingLotSystem;

public class TwoWheelerParkingSpot extends ParkingSpot{

    TwoWheelerParkingSpot(String id){
        super(id);
    }

    @Override
    Integer getPrice(){
        return 100;
    }

}
