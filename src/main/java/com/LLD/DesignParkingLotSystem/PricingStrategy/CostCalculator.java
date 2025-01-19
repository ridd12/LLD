package com.LLD.DesignParkingLotSystem.PricingStrategy;

import com.LLD.DesignParkingLotSystem.ParkingTicket;

public interface CostCalculator {
    public int calculatePrice(ParkingTicket parkingTicket);
}
