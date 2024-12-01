package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(6.0, App.add(2.5, 3.5));
    }

    @Test
    public void testSubtract() {
        assertEquals(2.5, App.subtract(5.7, 3.2));
    }

    @Test
    public void testMultiply() {
        assertEquals(9.0, App.multiply(4.5, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(3.3333333333333335, App.divide(10, 3), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> App.divide(10, 0));
        assertEquals("Cannot divide by zero", thrown.getMessage());
    }

    @Test
    public void testPower() {
        assertEquals(8.0, App.power(2, 3));
        assertEquals(1.0, App.power(5, 0));
        assertEquals(0.25, App.power(2, -2));
    }

    @Test
    public void testSqrt() {
        assertEquals(5.0, App.sqrt(25));
        assertEquals(3.0, App.sqrt(9));
    }

    @Test
    public void testSqrtNegativeNumber() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> App.sqrt(-25));
        assertEquals("Cannot take the square root of a negative number", thrown.getMessage());
    }
}
