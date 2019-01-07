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

        //Prints total of basket (pre-discount)
        System.out.println("\n" + "Total cost of basket: £"
                + String.format("%.2f",  customerBasket.totalCost()));

        //Prints skuArray using toString
        System.out.println(Arrays.toString(customerBasket.skuArray()));

        // Prints SKU array iteratively
        for (char element : customerBasket.skuArray()) {
            System.out.print(element + ", ");
        }

        //A dumb print out frequency of SKUs
        System.out.println("\n" + "Frequency of SKU A = " + customerBasket.skuFrequencyCount('A'));
        System.out.println("Frequency of SKU B = " + customerBasket.skuFrequencyCount('B'));
        System.out.println("Frequency of SKU C = " + customerBasket.skuFrequencyCount('C'));
        System.out.println("Frequency of SKU D = " + customerBasket.skuFrequencyCount('D'));


        //Assumed range of SKUs needs to be tidied away somewhere sensible
        char[] skuRange ="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    }
}
