package ua.edu.ucu.apps.demo.Orders;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price, User user) {
        return user.pay(price);
    }
}
