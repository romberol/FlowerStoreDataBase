package ua.edu.ucu.apps.demo.Decorators;

import ua.edu.ucu.apps.demo.Item;

public class BasketDecorator extends ItemDecorator{
    private Item item;
    public BasketDecorator(String description, Item item) {
        super(description);
        this.item = item;
    }

    @Override
    public double price() {
        return 4 + item.price();
    }
}
