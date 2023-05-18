package com.example.headfirst.state;

public class Delivered implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("이미 주문이 배송되었습니다");
    }

    @Override
    public void prev(Order order) {
        order.setState(new Delivery());
    }

    @Override
    public void printStatus() {
        System.out.println("주문이 배송되었습니다.");
    }
}
