package com.LLD.DesignPattern.ObserverPattern.GoodCode;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements Observable{


    WeatherStationObservable(){
        super();
    }
    List<Observer> list=new ArrayList<>();
    int data=0;
    @Override
    public void add(Observer observer) {
        list.add(observer);
    }


    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void setData(int data) {
        this.data=data;
        notifyAllObservers();
    }

    @Override
    public void notifyAllObservers() {
        System.out.println("Updating All the Observers");
        for(Observer observer:list){
            observer.update();
        }
    }

    @Override
    public void getData(){
        System.out.println("Data "+this.data);
    }
}
