package com.davhal;

import static com.davhal.DiscountComputer.printSkuTable;

public class Main {

    public static void main(String[] args) {

        Basket customerBasket = new Basket();
        DiscountBuilder currentDiscounts = new DiscountBuilder();

        /*  The adding of items to the basket object ideally
            would be via external GUI e.g. an online form.
             You can add to itemList as much as you want below */
        customerBasket.itemList.add(new Item("Apple", 0.50D, 'A' ));
        customerBasket.itemList.add(new Item("Pear", 0.20D, 'C' ));
        customerBasket.itemList.add(new Item("Banana", 0.30D, 'B' ));
        customerBasket.itemList.add(new Item("Kiwi", 0.15D, 'D' ));
        customerBasket.itemList.add(new Item("Apple", 0.50D, 'A' ));
        customerBasket.itemList.add(new Item("Apple", 0.50D, 'A' ));

        // Prints each item and its details
        customerBasket.printBasket();

        //Prints total of basket (pre-discount)
        customerBasket.printTotalCost();

        //Prints a table of the SKU count in a passed Basket Object
        printSkuTable(customerBasket);

        //Prints current discounts
        currentDiscounts.printDiscounts();









        //////////////////////////
        /// WIP Testing
        ////////////////////////
        Discount skuA = new Discount('A', 3, "for", 1.30);

        Discount skuB = new Discount('B', 2, "for", 45);

        int applyDiscountCount = customerBasket.skuFrequencyCount(skuA.getSku()) / skuA.getCount();

        System.out.println(new StringBuilder()
                .append("How many times to apply discount ")
                .append("'")
                .append(skuA.toString())
                .append("'")
                .append(": ")
                .append(applyDiscountCount)
                .append(" time(s)").toString());
        ////////////////////////





    }
}
