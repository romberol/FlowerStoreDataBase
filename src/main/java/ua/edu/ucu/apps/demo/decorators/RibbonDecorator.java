package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.Item;

public class RibbonDecorator extends ItemDecorator {
    private static final int ADD = 40;

    RibbonDecorator(Item item) {
        super(item);
    }


    @Override
    public double price() {
        return ADD + item.price();
    }
}
