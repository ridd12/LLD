package com.LLD.DesignPattern.DecoratorPattern;

public class ExtraCheeseDecorator implements Pizza{

    Pizza pizza;

    ExtraCheeseDecorator(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public Integer cost() {
        return pizza.cost()+20;
    }
}
