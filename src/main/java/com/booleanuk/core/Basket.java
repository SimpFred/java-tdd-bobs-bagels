package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<String> bagels;
    private List<String> basket;

    private static final int MAX_BAGELS = 5;

    public Basket() {
        this.bagels = List.of("bagel1", "bagel2", "bagel3", "bagel4");
        this.basket = new ArrayList<>();
    }

    public boolean addItem(String item) {
        if (item.isEmpty() || !bagels.contains(item)) {
            return false;
        }
        basket.add(item);
        return true;
    }

    public boolean removeItem(String item) {
        if (item.isEmpty() || !basket.contains(item)) {
            System.out.println("Bagel is not in the basket");
            return false;
        }
        basket.remove(item);
        return true;
    }

    public boolean isBasketFull() {
        if (basket.size() == MAX_BAGELS) {
            System.out.println("Basket is full");
            return true;
        }
        return false;
    }

}
