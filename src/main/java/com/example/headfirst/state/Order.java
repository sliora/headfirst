package com.example.headfirst.state;


public class Order {
    private OrderState state;

    public Order() {
        state = new Preparation();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public OrderState getState() {
        return state;
    }

    public void prev() {
        state.prev(this);
    }

    public void next() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
