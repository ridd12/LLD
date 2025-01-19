package com.LLD.DesignParkingLotSystem.PricingStrategy;

import com.LLD.DesignParkingLotSystem.ParkingTicket;

import java.util.Date;

public class PerMinuteStrategy implements PricingStrategy{
    @Override
    public int calculatePrice(ParkingTicket parkingTicket) {
        return 321;
    }
}
