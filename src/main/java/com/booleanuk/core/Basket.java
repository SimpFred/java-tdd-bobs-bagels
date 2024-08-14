package com.booleanuk.core;

public class Basket {


    public boolean addItem(String item) {
        if (item.isEmpty()) {
            return false;
        }
        return true;
    }

}
