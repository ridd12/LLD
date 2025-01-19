package com.LLD.DesignParkingLotSystem;

import java.util.List;

public class TwoWheelerParkingManager extends ParkingManager{
    TwoWheelerParkingManager(List<ParkingSpot> parkingSpotList,ParkingStrategy parkingStrategy) {
        super(parkingSpotList,parkingStrategy);
    }


}
