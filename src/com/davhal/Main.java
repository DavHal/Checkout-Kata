package com.davhal;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //This would be set dynamically by an order final count
        int orderCount = 6;

        ArrayList<Item> basket = new ArrayList<>();
        basket.ensureCapacity(orderCount);

        basket.add(new Item("Apple", 0.50D, 'A' ));
        basket.add(new Item("Apple", 0.50D, 'A' ));
        basket.add(new Item("Banana", 0.30D, 'B' ));
        basket.add( new Item("Pear", 0.20D, 'C' ));
        basket.add(new Item("Banana", 0.30D, 'B' ));
        basket.add(new Item("Kiwi", 0.15D, 'D' ));


        for (Item i : basket) {
            System.out.println("Item Name= " + i.getItemName()
                    + ", Price= £" + String.format("%.2f", i.getPrice())
                    + ", SKU= " + i.getSku());
        }

        // totalCost(basket);

    }
}
