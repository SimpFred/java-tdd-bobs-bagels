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
        Assertions.assertTrue(basket.addItem("bagel1"));
        Assertions.assertTrue(basket.removeItem("bagel1"));
        Assertions.assertFalse(basket.removeItem("bagel1"));
    }

    @Test
    void testIsBasketFull() {
        Assertions.assertFalse(basket.isBasketFull());
        Assertions.assertTrue(basket.addItem("bagel1"));
        Assertions.assertTrue(basket.addItem("bagel2"));
        Assertions.assertTrue(basket.addItem("bagel3"));
        Assertions.assertTrue(basket.addItem("bagel4"));
        Assertions.assertTrue(basket.addItem("bagel4"));
        Assertions.assertTrue(basket.isBasketFull());
    }

    @Test
    void testIncrementBasketCapacity() {
        basket.incrementBasketCapacity();
    }
}
