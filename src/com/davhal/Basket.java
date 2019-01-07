package com.davhal;

import java.util.ArrayList;
import java.util.List;

public class Basket extends Order {

    public Basket() {
        ArrayList<Item> itemList = new ArrayList<>();
    }

    public double totalCost(List<Item> basket) {

        double total = 0 ;

        for (Item i : basket) {
            total  = total + i.getPrice();
        }

        return total;

    }
}
