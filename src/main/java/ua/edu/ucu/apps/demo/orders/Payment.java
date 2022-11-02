package ua.edu.ucu.apps.demo.orders;

public interface Payment {
    boolean pay(double price, User user);
}
