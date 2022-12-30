package Decorator;

public class PaintFrame extends ServiceDecorator{
    public PaintFrame(BikeService bikeService) {
        super(bikeService);
    }

    @Override
    public void serve() {
        System.out.println("Painting frame");
        super.serve();
    }
}
