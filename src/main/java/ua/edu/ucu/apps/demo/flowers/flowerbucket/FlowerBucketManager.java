package ua.edu.ucu.apps.demo.flowers.flowerbucket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.flowers.Flower;
import ua.edu.ucu.apps.demo.flowers.FlowerColor;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/flowers/flowerbuckets")
@RestController
public class FlowerBucketManager {
    private List<FlowerBucket> bucketList = new ArrayList<>();

    public FlowerBucketManager() {
        int sepal = 12;
        double price = 12.90;
        Flower flower = new Flower("1", sepal, FlowerColor.RED, price);
        FlowerBucket bucket = new FlowerBucket("2");
        bucket.addFlower(flower);
        this.bucketList.add(bucket);
    }

    @GetMapping
    public List<FlowerBucket> getAllFlowerBuckets() {
        return this.bucketList;
    }
}
