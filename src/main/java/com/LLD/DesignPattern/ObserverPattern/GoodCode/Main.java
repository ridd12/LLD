package com.LLD.DesignPattern.ObserverPattern.GoodCode;

public class Main {
    public static void main(String[] args) {
        WeatherStationObservable weatherStationObservable=new WeatherStationObservable();

        TVStationObserver tvStationObserver =new TVStationObserver(weatherStationObservable);
        RadioStationObserver radioStationObserver=new RadioStationObserver(weatherStationObservable);

        weatherStationObservable.setData(1);

        weatherStationObservable.add(tvStationObserver);
        weatherStationObservable.add(radioStationObserver);

        weatherStationObservable.setData(22);

        weatherStationObservable.setData(23);

        weatherStationObservable.remove(radioStationObserver);

        weatherStationObservable.setData(24);



    }
}
