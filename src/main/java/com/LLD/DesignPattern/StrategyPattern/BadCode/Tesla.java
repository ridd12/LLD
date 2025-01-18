package com.LLD.DesignPattern.StrategyPattern.BadCode;

public class Tesla extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Custom start engine");
    }
}
