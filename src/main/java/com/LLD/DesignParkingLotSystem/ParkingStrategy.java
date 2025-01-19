package com.LLD.DesignParkingLotSystem;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot getParkingSpot(List<ParkingSpot> parkingSpotList);
}
