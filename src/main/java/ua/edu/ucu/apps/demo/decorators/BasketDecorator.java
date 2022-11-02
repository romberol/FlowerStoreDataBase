package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.Item;

public class BasketDecorator extends ItemDecorator {
    private int add = 4;
    private Item item;

    public BasketDecorator(String description, Item item) {
        super(description);
        this.item = item;
    }

    @Override
    public double price() {
        return add + item.price();
    }
}
