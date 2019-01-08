package com.davhal;

import java.util.Arrays;

import static com.davhal.DiscountComputer.printSkuTable;

public class Main {

    public static void main(String[] args) {

        Basket customerBasket = new Basket();

        /*  The adding of items to the basket object ideally
            would be via external GUI e.g. an online form */
        customerBasket.itemList.add(new Item("Apple", 0.50D, 'A' ));
        customerBasket.itemList.add( new Item("Pear", 0.20D, 'C' ));
        customerBasket.itemList.add(new Item("Banana", 0.30D, 'B' ));
        customerBasket.itemList.add(new Item("Kiwi", 0.15D, 'D' ));
        customerBasket.itemList.add(new Item("Apple", 0.50D, 'A' ));

        // Prints each item and its details
        customerBasket.printBasket();

        //Prints total of basket (pre-discount)
        System.out.println("\n" + "Total cost of basket: £"
                + String.format("%.2f",  customerBasket.totalCost()));

        //Prints a table of the SKU count in a passed Basket Object
        printSkuTable(customerBasket);



    }
}
