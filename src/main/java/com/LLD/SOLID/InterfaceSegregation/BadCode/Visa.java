package com.LLD.SOLID.InterfaceSegregation.BadCode;

public class Visa implements SendMoney{

    @Override
    public void sendMoneyInternationally() {
        return;
    }

    @Override
    public void sendMoneyDomestically() {
        return;
    }
}
