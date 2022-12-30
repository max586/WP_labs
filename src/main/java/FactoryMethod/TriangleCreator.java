package FactoryMethod;

public class TriangleCreator implements ShapeCreator{
    @Override
    public Shape factory() {
        return new Triangle();
    }
}
