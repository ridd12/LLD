package com.LLD.DesignParkingLotSystem.PricingStrategy;

import com.LLD.DesignParkingLotSystem.ParkingTicket;

public class FourWheelerCostCalculator implements CostCalculator{

    PricingStrategy pricingStrategy;

    FourWheelerCostCalculator(PricingStrategy pricingStrategy){
        this.pricingStrategy=pricingStrategy;
    }

    @Override
    public int calculatePrice(ParkingTicket parkingTicket) {
        return pricingStrategy.calculatePrice(parkingTicket);
    }
}
