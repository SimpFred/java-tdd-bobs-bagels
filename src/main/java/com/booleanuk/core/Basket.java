package com.booleanuk.core;

import java.util.List;

public class Basket {

    private final List<String> bagels;

    public Basket() {
        this.bagels = List.of("bagel1", "bagel2", "bagel3", "bagel4");
    }

    public boolean addItem(String item) {
        if (item.isEmpty() || !bagels.contains(item)) {
            return false;
        }
        return true;
    }

}
