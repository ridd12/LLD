package com.LLD.SOLID.InterfaceSegregation.GoodCode;

public class Visa implements SendDomestically,SendInternationally{

    @Override
    public void sendMoneyDomestically() {
        return;
    }

    @Override
    public void sendMoneyInternationally() {
return;
    }
}
