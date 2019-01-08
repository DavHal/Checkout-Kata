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
        customerBasket.itemList.add(new Item("Apple", 0.50D, 'A' ));

        // Prints each item and its details
        customerBasket.printBasket();

        //Prints total of basket (pre-discount)
        System.out.println("\n" + "Total cost of basket: £"
                + String.format("%.2f",  customerBasket.totalCost()));

        //Prints a table of the SKU count in a passed Basket Object
        printSkuTable(customerBasket);


        String A = "A 3 for 150";
        String B = "B 2 for 45";
        String[] discountOne = A.split(" ");

        Discount skuA = new Discount('A', 3, "for", 150);







        System.out.println(Arrays.toString(discountOne));

        System.out.println("count of sku A " + customerBasket.skuFrequencyCount('A'));
        System.out.println("fetched sku from discount array " + Integer.parseInt(discountOne[1]));

       int applyDiscountCount = customerBasket.skuFrequencyCount('A') / Integer.parseInt(discountOne[1]);

       System.out.println("How many times to apply discount "+  A + " " + applyDiscountCount);



    }
}
