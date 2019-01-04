package com.davhal;

import java.util.List;

public class TotalCost {

    public static double totalCost(List<Item> basket) {

        double total = 0 ;

        for (Item i : basket) {
            total  = total + i.getPrice();
        }

        return total;

    }


}
