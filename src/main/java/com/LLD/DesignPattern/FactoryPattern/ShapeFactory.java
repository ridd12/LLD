package com.LLD.DesignPattern.FactoryPattern;

public class ShapeFactory {
    public static Shape getShape(int i){

        switch (i){
            case 3:
                return new Traingle();
            case 4:
                return new Square();
            default:
                return new Traingle();

        }

    }
}
