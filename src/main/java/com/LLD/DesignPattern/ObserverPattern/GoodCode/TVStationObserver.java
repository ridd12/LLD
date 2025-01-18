package com.LLD.DesignPattern.ObserverPattern.GoodCode;

public class TVStationObserver implements Observer{

    Observable observable;

    TVStationObserver(Observable observable){
        this.observable=observable;
    }
    @Override
    public void update() {
        //Some bussiness logic;
//        System.out.println("Updating TV with "+observable.data);
        observable.getData();

    }

}
