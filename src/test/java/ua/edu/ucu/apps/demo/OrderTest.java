package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.flowers.Flower;
import ua.edu.ucu.apps.demo.flowers.FlowerColor;
import ua.edu.ucu.apps.demo.orders.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.orders.Order;
import ua.edu.ucu.apps.demo.orders.PayPalPaymentStrategy;
import ua.edu.ucu.apps.demo.orders.User;

import java.util.ArrayList;
import java.util.List;

public class OrderTest {
    private static final int PRICE = 100;
    private static final int SEPAL = 13;
    private static final String DESCR = "Flower 1";
    private static final String DESCRSECOND = "Flower 2";
    private static final double BALANCE = 300;
    private static final String FINALADDRESS = "Ukraine";

    private List<Order> orders = new ArrayList<>();
//    private boolean resultOfTransaction;

    @Test
    public void testTransaction(){
        Flower flower = new Flower(DESCR, SEPAL, FlowerColor.RED, PRICE);
        Flower flowerSecond = new Flower(DESCRSECOND, SEPAL, FlowerColor.BLUE, PRICE);
        Order order = new Order();
        order.addItem(flower);
        order.addItem(flowerSecond);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        User user = new User(BALANCE, FINALADDRESS);
        User userLow = new User(PRICE, FINALADDRESS);
        boolean transact = order.processOrder(user);
        boolean transactSecond = order.processOrder(userLow);
        this.orders.add(order);
        Assertions.assertEquals(user.getBalance(), BALANCE - PRICE - PRICE);
        Assertions.assertTrue(transact);
        Assertions.assertFalse(transactSecond);
        Assertions.assertEquals(userLow.getBalance(), PRICE);
    }
}
