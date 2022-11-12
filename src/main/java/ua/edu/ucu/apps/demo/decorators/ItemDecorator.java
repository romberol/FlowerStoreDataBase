package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.Item;

abstract class ItemDecorator extends Item {
    protected final Item item;

    ItemDecorator(Item item) {
        this.item = item;
    }
}
