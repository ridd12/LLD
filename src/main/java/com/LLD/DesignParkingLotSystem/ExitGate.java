package com.LLD.DesignParkingLotSystem;

import com.LLD.DesignParkingLotSystem.PricingStrategy.*;

public class ExitGate {

    public int calculatePrice(ParkingTicket parkingTicket){
        CostCalculator costCalculator=CostCalculatorFactory.CostCalculator(parkingTicket);

        int priceToPay=costCalculator.calculatePrice(parkingTicket);

        return priceToPay;

    }

}
