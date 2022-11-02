package ua.edu.ucu.apps.demo.Decorators;

import ua.edu.ucu.apps.demo.Item;

public class PaperDecorator extends ItemDecorator{
    private Item item;

    public PaperDecorator(String description, Item item) {
        super(description);
        this.item = item;
    }

    @Override
    public double price() {
        return 13 + item.price();
    }

}
