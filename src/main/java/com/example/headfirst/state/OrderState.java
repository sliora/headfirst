package com.example.headfirst.state;

public interface OrderState {
    void next(Order order);
    void prev(Order order);
    void printStatus();
}
