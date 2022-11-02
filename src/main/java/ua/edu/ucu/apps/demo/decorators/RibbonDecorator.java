package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.Item;

public class RibbonDecorator extends ItemDecorator {
    private static final int ADD = 40;
    private Item item;

    public RibbonDecorator(String description, Item item) {
        super(description);
        this.item = item;
    }

    @Override
    public double price() {
        return ADD + item.price();
    }
}
