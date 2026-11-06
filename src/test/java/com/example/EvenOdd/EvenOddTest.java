package com.example.EvenOdd;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class EvenOddCTest {


    @Test
    void testEvenNumber() {
        assertTrue(EvenOdd.isEven(10));
    }


    @Test
    void testOddNumber() {
        assertFalse(EvenOdd.isEven(7));
    }


    @Test
    void testZeroIsEven() {
        assertTrue(EvenOdd.isEven(0));
    }


    @Test
    void testNegativeEven() {
        assertTrue(EvenOdd.isEven(-4));
    }


    @Test
    void testNegativeOdd() {
        assertFalse(EvenOdd.isEven(-3));
    }
}