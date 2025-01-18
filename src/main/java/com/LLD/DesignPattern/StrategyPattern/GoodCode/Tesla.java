package com.LLD.DesignPattern.StrategyPattern.GoodCode;

public class Tesla extends Vehicle {

    Tesla(EngineStarterStrategy defaultEngineStarter) {
        super(defaultEngineStarter);
    }

}
