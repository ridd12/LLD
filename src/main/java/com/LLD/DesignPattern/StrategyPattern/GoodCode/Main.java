package com.LLD.DesignPattern.StrategyPattern.GoodCode;

import com.LLD.DesignPattern.StrategyPattern.GoodCode.BYD;

public class Main {
    public static void main(String[] args) {
        Tesla tesla=new Tesla(new CustomEngineStarter());
        BYD byd=new BYD(new DefaultEngineStarter());
        tesla.start();
        byd.start();
    }
}
