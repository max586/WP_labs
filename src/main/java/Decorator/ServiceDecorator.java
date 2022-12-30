package Decorator;

public class ServiceDecorator implements BikeService{
    BikeService nextService=null;
    public ServiceDecorator(BikeService bikeService){
        this.nextService = bikeService;
    }
    @Override
    public void serve() {
        if(nextService!=null)nextService.serve();
    }
}
