package com.booleanuk.core;

import java.util.List;

public class Basket {

    private final List<String> bagels;
    private List<String> basket;

    public Basket() {
        this.bagels = List.of("bagel1", "bagel2", "bagel3", "bagel4");
        this.basket = List.of();
    }

    public boolean addItem(String item) {
        if (item.isEmpty() || !bagels.contains(item)) {
            return false;
        }
        basket.add(item);
        return true;
    }

    public boolean removeItem(String item) {
        if (item.isEmpty() || !bagels.contains(item)) {
            return false;
        }
        return true;
    }

}
