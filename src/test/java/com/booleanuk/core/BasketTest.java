package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    private final Basket basket = new Basket();

    @Test
    void testAddItem() {
        Assertions.assertFalse(basket.addItem(""));
        Assertions.assertTrue(basket.addItem("bagel1"));
        Assertions.assertFalse(basket.addItem("bagelThatNotExists"));
        Assertions.assertTrue(basket.addItem("bagel4"));
    }

    @Test
    void testRemoveItem() {
        Assertions.assertFalse(basket.removeItem(""));
        Assertions.assertTrue(basket.removeItem("bagel1"));
        Assertions.assertFalse(basket.removeItem("bagelThatNotExists"));
    }
}
