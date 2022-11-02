package ua.edu.ucu.apps.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Item {
    private String description;

    public abstract double price();

    public String getDescription() {
        return description;
    }
}

