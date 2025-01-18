package com.LLD.DesignPattern.DecoratorPattern;

public class Main {

    public static void main(String[] args) {

        Pizza pizza=new ExtraCheeseDecorator(new MargheritaPizza());

        Pizza pizza1=new ExtraMushroomDecorator(new ExtraCheeseDecorator(new FarmHousePizza()));

        System.out.println(pizza1.cost());

    }

}
