package com.davhal;

import java.util.Arrays;

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

        //Prints skuArray using toString
        System.out.println(Arrays.toString(customerBasket.skuArray()));

        // Prints SKU array iteratively
        for (char element : customerBasket.skuArray()) {
            System.out.print(element + ", ");
        }

        //Prints total of basket (pre-discount)
        System.out.println("\n" + "Total cost of basket: £"
                + String.format("%.2f",  customerBasket.totalCost()));


        // Will eventually be tidied away into method or new class
        int[] frequencyMap = new int[26];
        /*
        This does assume that SKUs will always be caps A-Z
        A = 60 Z = 90
         */
        for (int i = 0; i < customerBasket.skuArray().length; i++ ) {
            // 'A' is being used as a value 'anchor' to maintain element
            // range of '1'-'26'
            int c = customerBasket.skuArray()[i] - 'A';
            frequencyMap[c]++;
        }

        //Prints frequency array as well as 'SKU range' (A-Z)
        //for visible progress proof above loop works
        System.out.println(Arrays.toString(frequencyMap));
        char[] skuRange ="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        System.out.println(Arrays.toString(skuRange));
    }
}
