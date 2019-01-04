package com.davhal;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int OrderCount = 5;

        ArrayList<Item> basket = new ArrayList<>(OrderCount);

        basket.add(new Item("Apple", 0.50, 'A' ));

        basket.add(new Item("Apple", 0.50, 'A' ));
        basket.add(new Item("Banana", 0.30, 'B' ));
        basket.add( new Item("Apple", 0.50, 'A' ));
        basket.add(new Item("Banana", 0.30, 'A' ));
        basket.add(new Item("Apple", 0.50, 'A' ));


        for (Item i : basket) {
            System.out.println("Item Name= " + i.getItemName()
                    + ", Price= £" + i.getPrice()
                    + ", SKU= " + i.getSku());
        }

    }
}
