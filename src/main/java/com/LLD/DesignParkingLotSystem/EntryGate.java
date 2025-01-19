package com.LLD.DesignParkingLotSystem;

import java.util.Date;

public class EntryGate {

    public static void main(String[] args) {


        Vehicle a=new Vehicle(VehicleType.Two_Wheeler,"1234");

        ParkingManagerFactory parkingManagerFactory=new ParkingManagerFactory();

        parkingManagerFactory.listTwoWheelerParking.add(new TwoWheelerParkingSpot("1234"));

        ParkingManager parkingManager = parkingManagerFactory.getParkingManagerFactory(a);

        ParkingSpot parkingSpot=parkingManager.getParkingSpot();

        ParkingTicket parkingTicket=new ParkingTicket(parkingSpot,new Date(),"213123");

    }
}
