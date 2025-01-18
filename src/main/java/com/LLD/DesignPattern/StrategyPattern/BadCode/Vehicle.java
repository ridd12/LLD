package com.LLD.DesignPattern.StrategyPattern.BadCode;

public class Vehicle {
    public void startEngine(){
        System.out.println("default start engine");
    };
}

//As byd and tesla need SAME custom implementation . There is some code redundancy Instead refer good code