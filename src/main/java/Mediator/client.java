package Mediator;

import java.util.List;

public class client {
    public static void main(String[] args) {
        var order = new Order("order title",null);
        var services = List.of(new ReceiveOrder(),new VerifyOrder(),new CompleteOrder());
        var mediator = new OrderMediator(order,services);
        mediator.executeServices();
    }
}
