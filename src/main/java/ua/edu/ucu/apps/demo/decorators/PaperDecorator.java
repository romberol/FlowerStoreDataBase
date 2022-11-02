package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.Item;

public class PaperDecorator extends ItemDecorator {
    private Item item;
    private int add = 13;

    public PaperDecorator(String description, Item item) {
        super(description);
        this.item = item;
    }

    @Override
    public double price() {
        return add + item.price();
    }

}
