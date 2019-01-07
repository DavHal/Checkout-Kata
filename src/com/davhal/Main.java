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


        //TODO use frequency table array to count the frequency
        // of SKUs in basket object

        //int[] frequencyMap = new int[26];

        //for length of SKU array
        //cycle through SKUs
        //turn char a-z into 1-26
        //using value in SKU array as an index of the frequency map array
        //increment accordingly in frequency array




    }
}
