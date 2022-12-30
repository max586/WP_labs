package Decorator;

public class ReplacePedals extends ServiceDecorator{
    public ReplacePedals(BikeService bikeService) {
        super(bikeService);
    }
    @Override
    public void serve(){
        System.out.println("Replacing pedals");
        super.serve();
    }
}
