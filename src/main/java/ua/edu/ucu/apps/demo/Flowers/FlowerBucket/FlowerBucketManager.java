package ua.edu.ucu.apps.demo.Flowers.FlowerBucket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.Flowers.Flower;
import ua.edu.ucu.apps.demo.Flowers.FlowerColor;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/flowers/flowerbuckets") @RestController
public class FlowerBucketManager {
    List<FlowerBucket> bucketList = new ArrayList<>();

    public FlowerBucketManager(){
        Flower flower = new Flower("1", 12, FlowerColor.RED, 12.90);
        FlowerBucket bucket = new FlowerBucket("2");
        bucket.addFlower(flower);
        this.bucketList.add(bucket);
    }

    @GetMapping
    public List<FlowerBucket> getAllFlowerBuckets(){
        return this.bucketList;
    }
}
