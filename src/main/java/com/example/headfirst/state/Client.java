package com.example.headfirst.state;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();

        order.prev();
        order.printStatus();

        order.next();
        order.printStatus();

        order.next();
        order.printStatus();

        order.next();
        order.printStatus();

        order.prev();
        order.printStatus();
    }
}
