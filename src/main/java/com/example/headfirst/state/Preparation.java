package com.example.headfirst.state;

public class Preparation implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new Delivery());
    }

    @Override
    public void prev(Order order) {
        System.out.println("주문이 진행된게 없습니다.");
    }

    @Override
    public void printStatus() {
        System.out.println("주문이 준비 상태 입니다.");
    }
}
