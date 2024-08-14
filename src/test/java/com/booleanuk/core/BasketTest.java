package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    private Basket basket   = new Basket();

    @Test
    void testAddItem() {
        Assertions.assertFalse(basket.addItem(""));
    }

}
