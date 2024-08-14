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
    }

}
