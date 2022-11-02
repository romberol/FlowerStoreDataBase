package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.Flowers.Flower;
import ua.edu.ucu.apps.demo.Flowers.FlowerColor;
import ua.edu.ucu.apps.demo.Orders.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.Orders.Order;
import ua.edu.ucu.apps.demo.Orders.PayPalPaymentStrategy;
import ua.edu.ucu.apps.demo.Orders.User;

import java.util.ArrayList;
import java.util.List;

public class OrderTest {
    private static final int PRICE = 100;
    private static final int SEPAL = 13;
    private static final String DESCR1 = "Flower 1";
    private static final String DESCR2 = "Flower 2";
    private static final double BALANCE = 300;
    private static final String finalAddress = "Ukraine";

    private List<Order> orders = new ArrayList<>();
//    private boolean resultOfTransaction;

    @Test
    public void testTransaction(){
        Flower flower = new Flower(DESCR1, SEPAL, FlowerColor.RED, PRICE);
        Flower flower2 = new Flower(DESCR2, SEPAL, FlowerColor.BLUE, PRICE);
        Order order = new Order();
        order.addItem(flower);
        order.addItem(flower2);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        User user = new User(BALANCE, finalAddress);
        User userLow = new User(PRICE, finalAddress);
        boolean transact1 = order.processOrder(user);
        boolean transact2 = order.processOrder(userLow);
        this.orders.add(order);
        Assertions.assertEquals(user.getBalance(), BALANCE - PRICE - PRICE);
        Assertions.assertTrue(transact1);
        Assertions.assertFalse(transact2);
        Assertions.assertEquals(userLow.getBalance(), PRICE);
    }
}
