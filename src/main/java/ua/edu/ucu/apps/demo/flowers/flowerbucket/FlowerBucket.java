package ua.edu.ucu.apps.demo.flowers.flowerbucket;

import lombok.Getter;
import ua.edu.ucu.apps.demo.flowers.Flower;
import ua.edu.ucu.apps.demo.flowers.FlowerType;
import ua.edu.ucu.apps.demo.Item;

import java.util.ArrayList;

public class FlowerBucket extends Item {
    @Getter
    private ArrayList<Flower> bucket;

    public FlowerBucket(String description) {
        super(description);
        this.bucket = new ArrayList<>();
    }

    public ArrayList<Flower> searchFlower(FlowerType flType) {
        ArrayList<Flower> foundFlowers = new ArrayList<>();
        for (Flower flower : this.bucket) {
            if (flower.getFlowerType() == flType) {
                foundFlowers.add(flower);
            }
        }
        if (foundFlowers.isEmpty()) {
            return null;
        }
        return foundFlowers;
    }

    public void addFlower(Flower flower) {
        this.bucket.add(flower);
    }

    public void addFlowers(ArrayList<Flower> flowerList) {
        flowerList.forEach(this::addFlower);
    }

    @Override
    public double price() {
        double price = 0;
        for (Flower flower : this.bucket) {
            price += flower.price();
        }
        return price;
    }
}
