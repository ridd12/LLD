package com.LLD.DesignParkingLotSystem.PricingStrategy;

import com.LLD.DesignParkingLotSystem.ParkingTicket;

public class TwoWheelerCostCalculator implements CostCalculator{
    PricingStrategy pricingStrategy;

    TwoWheelerCostCalculator(PricingStrategy pricingStrategy){
        this.pricingStrategy=pricingStrategy;
    }

    @Override
    public int calculatePrice(ParkingTicket parkingTicket) {
        return pricingStrategy.calculatePrice(parkingTicket);
    }
}
