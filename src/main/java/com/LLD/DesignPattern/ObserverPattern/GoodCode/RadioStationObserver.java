package com.LLD.DesignPattern.ObserverPattern.GoodCode;

public class RadioStationObserver implements Observer{

    Observable observable;

    RadioStationObserver(Observable observable){
        this.observable=observable;
    }

    @Override
    public void update() {
//        System.out.println("Updating Radios with "+ observable.data);
        observable.getData();
        //Some business logic
    }
}
