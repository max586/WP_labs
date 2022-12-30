package Decorator;

public class PumpUpTires extends ServiceDecorator{
    public PumpUpTires(BikeService bikeService) {
        super(bikeService);
    }

    @Override
    public void serve() {
        System.out.println("Pumping up tires");
        super.serve();
    }
}
