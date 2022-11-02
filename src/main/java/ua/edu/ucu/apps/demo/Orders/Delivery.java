package ua.edu.ucu.apps.demo.Orders;

import ua.edu.ucu.apps.demo.Item;

import java.util.List;

public interface Delivery {
    boolean deliver(List<Item> items, User user);
}
