package FactoryMethod;

public class RectangleCreator implements ShapeCreator{
    @Override
    public Shape factory() {
        return new Rectangle();
    }
}
