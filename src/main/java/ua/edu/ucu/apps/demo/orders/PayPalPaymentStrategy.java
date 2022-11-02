package ua.edu.ucu.apps.demo.orders;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price, User user) {
        return user.pay(price);
    }

}
