package Decorator;

public class Client {
    public static void main(String[] args) {
        BikeService myServices = new PaintFrame(new PumpUpTires(new ReplaceWheel(new ReplacePedals(null))));
        myServices.serve();
    }
}
