package FactoryMethod;

import FactoryMethod.Rectangle;
import FactoryMethod.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("----\n|  |\n----");
    }
}
