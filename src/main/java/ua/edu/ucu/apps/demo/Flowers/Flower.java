package ua.edu.ucu.apps.demo.Flowers;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.Item;

@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;


    public Flower(String description, double sepalLength, FlowerColor color, double price){
        super(description);
        this.price = price;
        this.sepalLength = sepalLength;
        this.color = color;
    }
    private double price;

    @Getter
    private FlowerType flowerType = FlowerType.TULIP; //by Default

    public String getColor() {
        return color.toString();
    }

    @Override
    public double price() {
        return this.price;
    }
}
