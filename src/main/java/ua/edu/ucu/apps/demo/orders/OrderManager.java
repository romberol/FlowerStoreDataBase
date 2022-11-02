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

    public OrderManager() {
        double price = 12.90;
        int priceSecond = 123;
        int sepal = 12;
        int sepalSecond = 20;
        int balance = 1000;
        Flower flower = new Flower("1", sepal, FlowerColor.RED, price);
        Flower flowerSecond = new Flower("2", sepalSecond, FlowerColor.BLUE, priceSecond);
        Order order = new Order();
        order.addItem(flower);
        order.addItem(flowerSecond);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        User user = new User(balance, "Ukraine");
        this.resultOfTransaction = order.processOrder(user);
        this.orders.add(order);
    }

    @GetMapping
    public List<Order> getOrders() {
        return this.orders;
    }

    @GetMapping("/results")
    public String getResults() {
        if (this.resultOfTransaction)
            return "Transaction was successful";
        return "Transaction wasn't successful";
    }
}
