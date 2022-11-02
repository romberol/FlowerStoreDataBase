package ua.edu.ucu.apps.demo.flowers;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.Item;

@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    private double price;
    @Getter
    private FlowerType flowerType = FlowerType.TULIP; //by Default


    public Flower(String description, double sepalLength,
                  FlowerColor color, double price) {
        super(description);
        this.price = price;
        this.sepalLength = sepalLength;
        this.color = color;
    }

    public String getColor() {
        return color.toString();
    }

    @Override
    public double price() {
        return this.price;
    }
}
