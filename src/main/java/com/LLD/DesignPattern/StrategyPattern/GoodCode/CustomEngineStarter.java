package com.LLD.DesignPattern.StrategyPattern.GoodCode;

public class CustomEngineStarter implements EngineStarterStrategy{
    @Override
    public void startEngine() {
        System.out.println("Starting CustomEngineStarter");
    }
}
