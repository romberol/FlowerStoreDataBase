package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.Item;

abstract class ItemDecorator extends Item {

    ItemDecorator(String description) {
        super(description);
    }
}
