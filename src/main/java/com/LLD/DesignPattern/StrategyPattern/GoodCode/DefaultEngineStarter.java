package com.LLD.DesignPattern.StrategyPattern.GoodCode;

public class DefaultEngineStarter implements EngineStarterStrategy{
    @Override
    public void startEngine() {
        System.out.println("Starting DefaultEngineStarter");
    }
}
