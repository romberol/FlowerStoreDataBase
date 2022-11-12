package ua.edu.ucu.apps.demo.flowers.flowerbucket;

import org.springframework.stereotype.Service;
import ua.edu.ucu.apps.demo.flowers.Flower;
import ua.edu.ucu.apps.demo.flowers.FlowerColor;
import ua.edu.ucu.apps.demo.flowers.FlowerType;

import java.util.List;

@Service
public class FlowerBucketService {
    private static final int SEPAL = 12;
    private static final double PRICE = 12.90;

    public List<FlowerBucket> getAllFlowerBuckets() {
        Flower flower = new Flower(1, SEPAL, FlowerColor.RED,
                PRICE, FlowerType.TULIP);
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlower(flower);
        return List.of(bucket);
    }
}
