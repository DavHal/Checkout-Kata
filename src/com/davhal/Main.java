package com.davhal;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();

        /*  The adding of items to the basket object ideally
            would be via external GUI e.g. an online form */
        basket.itemList.add(new Item("Apple", 0.50D, 'A' ));
        basket.itemList.add( new Item("Pear", 0.20D, 'C' ));
        basket.itemList.add(new Item("Banana", 0.30D, 'B' ));
        basket.itemList.add(new Item("Kiwi", 0.15D, 'D' ));
        basket.itemList.add(new Item("Apple", 0.50D, 'A' ));

        // Prints each item and its details
        basket.printBasket();

        /* Prints total of basket (pre-discount), demonstrating
            totalCost() method returns double */
        System.out.println("Total cost of basket: £"
                + String.format("%.2f",  basket.totalCost()));

        // Prints the skuArray array
        for (char element : basket.skuArray()) {
            System.out.print(element + ", ");
        }

    }
}
