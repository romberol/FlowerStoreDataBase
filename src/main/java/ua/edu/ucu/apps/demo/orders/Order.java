package ua.edu.ucu.apps.demo.orders;

import lombok.Getter;
import ua.edu.ucu.apps.demo.Item;

import java.util.ArrayList;
import java.util.List;


public class Order {
    @Getter
    private List<Item> items;
    private Payment payment;
    @Getter
    private Delivery delivery;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void setPaymentStrategy(Payment paym) {
        this.payment = paym;
    }

    public void setDeliveryStrategy(Delivery del) {
        this.delivery = del;
    }

    public double calculateTotalPrice() {
        return this.items.stream().mapToDouble(Item::price).sum();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public boolean removeItem(Item item) {
        return this.items.remove(item);
    }

    public boolean processOrder(User user) {
        if (this.payment.pay(calculateTotalPrice(), user)) {
            return this.delivery.deliver(items, user);
        }
        return false;
    }

}