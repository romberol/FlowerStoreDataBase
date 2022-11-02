package ua.edu.ucu.apps.demo.Decorators;

import ua.edu.ucu.apps.demo.Item;

public class RibbonDecorator extends ItemDecorator{
    private Item item;

    public RibbonDecorator(String description, Item item) {
        super(description);
        this.item = item;
    }

    @Override
    public double price() {
        return 40 + item.price();
    }
}
