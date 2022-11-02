package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.Item;

public class PaperDecorator extends ItemDecorator {
    private Item item;
    private static final int ADD = 13;

    public PaperDecorator(String description, Item item) {
        super(description);
        this.item = item;
    }

    @Override
    public double price() {
        return ADD + item.price();
    }

}
