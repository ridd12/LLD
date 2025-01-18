package com.LLD.DesignPattern.StrategyPattern.GoodCode;

public class Vehicle {
    EngineStarterStrategy engineStarterStrategy;
    Vehicle(EngineStarterStrategy engineStarterStrategy){
        this.engineStarterStrategy=engineStarterStrategy;
    }

    public void start(){
        this.engineStarterStrategy.startEngine();
    }
}

//As byd and tesla need SAME custom implementation . There is some code redundancy Instead refer good code