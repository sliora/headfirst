package com.example.headfirst.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStateTest {
    @Test
    public void testOrderState() {
        Order order = new Order();

        Assertions.assertThat(order.getState()).isInstanceOf(Preparation.class);
        order.next();

        Assertions.assertThat(order.getState()).isInstanceOf(Delivery.class);
        order.next();

        Assertions.assertThat(order.getState()).isInstanceOf(Delivered.class);
        order.prev();

        Assertions.assertThat(order.getState()).isInstanceOf(Delivery.class);
    }
}