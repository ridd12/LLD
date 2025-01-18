package com.LLD.DesignPattern.ObserverPattern.GoodCode;

public interface Observable {

    public void add(Observer observer);
    public void remove(Observer observer);
    public void setData(int data);
    public void getData();
    public void notifyAllObservers();
}
