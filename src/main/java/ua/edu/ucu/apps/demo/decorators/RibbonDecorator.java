package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.Item;

import java.util.Optional;

public class RibbonDecorator extends ItemDecorator {
    private static final int ADD = 40;
    private Item item;

    RibbonDecorator(Item item) {
        this.item = item;
    }


    @Override
    public double price() {
        return ADD + item.price();
    }
}
