package com.LLD.DesignParkingLotSystem;

import java.util.List;

public class FourWheelerParkingManager extends ParkingManager {
    FourWheelerParkingManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        super(parkingSpotList, parkingStrategy);
    }

}
