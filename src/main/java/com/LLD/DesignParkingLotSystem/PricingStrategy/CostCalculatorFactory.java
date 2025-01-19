package com.LLD.DesignParkingLotSystem.PricingStrategy;

import com.LLD.DesignParkingLotSystem.ParkingTicket;
import com.LLD.DesignParkingLotSystem.VehicleType;

public class CostCalculatorFactory {

    public static CostCalculator CostCalculator(ParkingTicket parkingTicket) {
        return switch (parkingTicket.getParkingSpot().getV().getVehicleType()){
            case Four_Wheeler -> new FourWheelerCostCalculator(new HourlyPriceStrategy());
            case Two_Wheeler -> new TwoWheelerCostCalculator(new PerMinuteStrategy());
        };
    }

}
