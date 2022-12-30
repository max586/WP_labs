package Mediator;

public class CompleteOrder implements Service{
    @Override
    public Order execute(Order order) {
        System.out.println("Order is completed");
        return new Order(order.title(), OrderStates.COMPLETED);
    }
}
