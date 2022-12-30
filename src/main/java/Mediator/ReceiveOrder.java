package Mediator;

public class ReceiveOrder implements Service{
    @Override
    public Order execute(Order order) {
        System.out.println("Order is received");
        return new Order(order.title(), OrderStates.RECEIVED);
    }
}
