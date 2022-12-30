package Mediator;

import java.util.ArrayList;
import java.util.List;

public class OrderMediator {
    Order order;
    private List<Service> services = new ArrayList<>();
    private OrderStates orderState;

    public OrderMediator(Order order, List<Service> services){
        this.order = order;
        this.services = services;
    }
    public void addService(Service service){
        this.services.add(service);
    }
    public void executeServices(){
        for(var service: services)order=service.execute(order);
    }
}
