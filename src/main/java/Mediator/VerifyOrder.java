package Mediator;

public class VerifyOrder implements Service{
    @Override
    public Order execute(Order order) {
        if(order.title().startsWith("order")){
            System.out.println("Order was accepted");
            return new Order(order.title(), OrderStates.ACCEPTED);
        } else{
            System.out.println("Order was rejected");
            return new Order(order.title(), OrderStates.REJECTED);
        }
    }
}
