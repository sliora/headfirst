package com.example.headfirst.junit5;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    private SimpleCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SimpleCalculator();
    }

    @Test
    public void testAddition() {
        int result = calculator.add(3, 5);
        Assertions.assertThat(result).isEqualTo(8);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(7, 3);
        assertEquals(4, result, "7 - 3 should equal 4");
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiply(5, 6);
        assertEquals(30, result, "5 * 6 should equal 30");
    }

    @Test
    public void testDivision() {
        int result = calculator.divide(20, 4);
        assertEquals(5, result, "20 / 4 should equal 5");
    }

    @Test
    public void testDivisionByZero() {
        Assertions.assertThatThrownBy(() -> calculator.divide(10,0))
                .isInstanceOf(ArithmeticException.class);
    }
}