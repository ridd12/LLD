package com.LLD.DesignParkingLotSystem;

import lombok.Getter;

public class Vehicle{
    @Getter
    VehicleType vehicleType;
    String VehicleNumber;

    Vehicle(VehicleType vehicleType,String vehicleNumber){
        this.VehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;
    }

}
