package com.LLD.DesignParkingLotSystem;

import lombok.Getter;

public abstract class ParkingSpot {
    String id;
    @Getter
    Vehicle v;

    ParkingSpot(String id){
        this.id=id;
    }

    abstract Integer getPrice();
    Boolean isEmpty(){
        return v==null;
    }
    void parkVehicle(Vehicle v){
        this.v=v;
    }
    void removeVehicle(){
        if(v!=null){
            v=null;
        }
    }


}
