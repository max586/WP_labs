package FactoryMethod;

import FactoryMethod.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println(" /\\ \n/  \\\n____");
    }
}
