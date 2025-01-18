package com.LLD.SOLID.LiskovSubstitution.BadOne;

public class Bicycle implements Vehical{

    @Override
    public void startEngine() {
        throw new RuntimeException();
    }
}
