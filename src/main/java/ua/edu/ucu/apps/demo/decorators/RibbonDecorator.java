package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.Item;

public class RibbonDecorator extends ItemDecorator {
    private Item item;
    private int add = 40;

    public RibbonDecorator(String description, Item item) {
        super(description);
        this.item = item;
    }

    @Override
    public double price() {
        return add + item.price();
    }
}
