package com.LLD.DesignPattern.DecoratorPattern;

public class ExtraMushroomDecorator implements Pizza{

    Pizza pizza;

    ExtraMushroomDecorator(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public Integer cost() {
        return pizza.cost()+50;
    }

}
