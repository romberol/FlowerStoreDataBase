package ua.edu.ucu.apps.demo.orders;

import lombok.Getter;
import ua.edu.ucu.apps.demo.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    private List<String> possibleAddresses = List.of("Ukraine", "USA");
    @Getter
    private String deliveryAddress;

    @Override
    public boolean deliver(List<Item> items, User user) {
        this.deliveryAddress = user.getAddress();
        return this.possibleAddresses.contains(user.getAddress());
    }
}
