package ua.edu.ucu.apps.demo.flowers.flowerbucket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/flowers/flowerbuckets")
@RestController
public class FlowerBucketController {
    private final FlowerBucketService service;

    @Autowired
    public FlowerBucketController(FlowerBucketService service) {
        this.service = service;
    }

    @GetMapping
    public List<FlowerBucket> getAllFlowerBuckets() {
        return this.service.getAllFlowerBuckets();
    }
}
