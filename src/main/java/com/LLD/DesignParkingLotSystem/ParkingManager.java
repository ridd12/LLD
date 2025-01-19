package com.LLD.DesignParkingLotSystem;

import java.util.List;

public class ParkingManager {
    List<ParkingSpot> parkingSpotList;

    ParkingStrategy parkingStrategy;

    ParkingManager(List<ParkingSpot> parkingSpotList,ParkingStrategy parkingStrategy){
        this.parkingSpotList=parkingSpotList;
        this.parkingStrategy=parkingStrategy;
    }

    public void addToParkingSpotList(ParkingSpot parkingSpot){
        parkingSpotList.add(parkingSpot);
    }

    public void removeFromParkingSpotList(ParkingSpot parkingSpot){
        parkingSpotList.remove(parkingSpot);
    }

    public ParkingSpot getParkingSpot(){
        return parkingStrategy.getParkingSpot(parkingSpotList);
    };

    public void assignVehicleToParkingSpot(Vehicle vehicle, ParkingSpot parkingSpot){
        parkingSpot.parkVehicle(vehicle);
    }

    public void removeAssignedVehicleFromParkingSpot(ParkingSpot parkingSpot){
        parkingSpot.removeVehicle();
        parkingSpotList.add(parkingSpot);
    }

}
