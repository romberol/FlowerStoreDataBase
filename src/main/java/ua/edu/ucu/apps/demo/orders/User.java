package ua.edu.ucu.apps.demo.orders;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private double balance;
    private String address;

    boolean pay(double price) {
        if (price <= this.balance) {
            this.balance -= price;
            return true;
        }
        return false;
    }
}
