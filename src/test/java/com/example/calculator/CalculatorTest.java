package com.example.calculator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
 Calculator cal = new Calculator();
 @Test
 public void testAdd() {
    assertEquals(3,cal.add(1, 2));
    }

 @Test
 public void testSubtract() {
  assertEquals(5, cal.subtract(10, 5));
 }

 @Test
 public void testMultiply() {
  assertEquals(50, cal.multiply(10, 5));
 }

 @Test
 public void testDivide() {
  assertEquals(2, cal.divide(10, 5));
 }

 @Test
 public void testDivideByZero() {
  assertThrows(IllegalArgumentException.class, () -> cal.divide(10, 0));
 }

}
