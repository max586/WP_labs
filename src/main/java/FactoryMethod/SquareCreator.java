package FactoryMethod;

public class SquareCreator implements ShapeCreator{
    @Override
    public Shape factory() {
        return new Square();
    }
}
