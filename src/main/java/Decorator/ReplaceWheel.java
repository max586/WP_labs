package Decorator;

public class ReplaceWheel extends ServiceDecorator{
    public ReplaceWheel(BikeService bikeService) {
        super(bikeService);
    }

    @Override
    public void serve() {
        System.out.println("Replacing wheel");
        super.serve();
    }
}
