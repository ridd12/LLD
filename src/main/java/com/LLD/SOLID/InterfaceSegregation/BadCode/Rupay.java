package com.LLD.SOLID.InterfaceSegregation.BadCode;

public class Rupay implements SendMoney{
    @Override
    public void sendMoneyInternationally() {
        throw new RuntimeException();
    }

    @Override
    public void sendMoneyDomestically() {
        return;
    }
}
