package com.LLD.DesignParkingLotSystem.PricingStrategy;

import com.LLD.DesignParkingLotSystem.ParkingTicket;

import java.util.Date;

public interface PricingStrategy {
    public int calculatePrice(ParkingTicket parkingTicket);
}
