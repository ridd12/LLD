package com.LLD.DesignPattern.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Shape triangle= ShapeFactory.getShape(3);

        triangle.draw();

        Shape square= ShapeFactory.getShape(4);

        square.draw();
    }
}
