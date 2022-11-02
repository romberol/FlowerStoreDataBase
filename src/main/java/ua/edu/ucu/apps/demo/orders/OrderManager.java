package ua.edu.ucu.apps.demo.orders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.flowers.Flower;
import ua.edu.ucu.apps.demo.flowers.FlowerColor;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/order")
@RestController
public class OrderManager {
    private List<Order> orders = new ArrayList<>();
    private boolean resultOfTransaction;
    private static final double PRICE = 12.90;
    private static final int PRICESECOND = 123;
    private static final int SEPAL = 12;
    private static final int SEPALSECOND = 20;
    private static final int BALANCE = 1000;

    public OrderManager() {
        Flower flower = new Flower("1", SEPAL, FlowerColor.RED, PRICE);
        Flower flowerSecond = new Flower("2", SEPALSECOND, FlowerColor.BLUE, PRICESECOND);
        Order order = new Order();
        order.addItem(flower);
        order.addItem(flowerSecond);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        User user = new User(BALANCE, "Ukraine");
        this.resultOfTransaction = order.processOrder(user);
        this.orders.add(order);
    }

    @GetMapping
    public List<Order> getOrders() {
        return this.orders;
    }

    @GetMapping("/results")
    public String getResults() {
        if (this.resultOfTransaction) {
            return "Transaction was successful";
        }
        return "Transaction wasn't successful";
    }
}
