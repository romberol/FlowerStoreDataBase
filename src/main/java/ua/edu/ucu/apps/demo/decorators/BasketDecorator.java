package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.Item;

public class BasketDecorator extends ItemDecorator {
    private static final int ADD = 4;
    private Item item;

    BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return ADD + item.price();
    }
}
