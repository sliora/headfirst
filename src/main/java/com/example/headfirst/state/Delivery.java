package com.example.headfirst.state;

public class Delivery implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new Delivered());
    }

    @Override
    public void prev(Order order) {
        order.setState(new Preparation());
    }

    @Override
    public void printStatus() {
        System.out.println("주문이 배달되고 있습니다.");
    }
}
