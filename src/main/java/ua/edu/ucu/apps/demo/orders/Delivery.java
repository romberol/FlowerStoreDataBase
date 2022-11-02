package ua.edu.ucu.apps.demo.orders;

import ua.edu.ucu.apps.demo.Item;

import java.util.List;

public interface Delivery {
    boolean deliver(List<Item> items, User user);
}
