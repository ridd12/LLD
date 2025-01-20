package com.LLD.DesignParkingLotSystem;

import lombok.Getter;

import java.util.Date;

public class ParkingTicket {
    ParkingTicket(ParkingSpot parkingSpot,Date startTime,String id){
        this.parkingSpot=parkingSpot;
        this.startTime=startTime;
        this.id=id;
    }

    ParkingSpot parkingSpot;
    Date startTime;
    String id;

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }




}
