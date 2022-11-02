package ua.edu.ucu.apps.demo.Orders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.Flowers.Flower;
import ua.edu.ucu.apps.demo.Flowers.FlowerColor;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/order") @RestController
public class OrderManager {
    List<Order> orders = new ArrayList<>();
    boolean resultOfTransaction;

    public OrderManager(){
        Flower flower = new Flower("1", 12, FlowerColor.RED, 12.90);
        Flower flower2 = new Flower("2", 20, FlowerColor.BLUE, 123);
        Order order = new Order();
        order.addItem(flower);
        order.addItem(flower2);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        User user = new User(1000, "Ukraine");
        this.resultOfTransaction = order.processOrder(user);
        this.orders.add(order);
    }

    @GetMapping
    public List<Order> getOrders(){ return this.orders;}
    @GetMapping("/results")
    public String getResults() {
        if (this.resultOfTransaction)
            return "Transaction was successful";
        return "Transaction wasn't successful";
    }
}
