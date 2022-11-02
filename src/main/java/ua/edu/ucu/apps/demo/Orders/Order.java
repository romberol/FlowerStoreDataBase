package ua.edu.ucu.apps.demo.Orders;

import lombok.AllArgsConstructor;
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

    public Order(){
        this.items = new ArrayList<>();
    }
    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice(){
        return this.items.stream().mapToDouble(Item::price).sum();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public boolean removeItem(Item item){
        return this.items.remove(item);
    }

    public boolean processOrder(User user){
        if(this.payment.pay(calculateTotalPrice(), user)){
            return this.delivery.deliver(items, user);
        }
        return false;
    }

}