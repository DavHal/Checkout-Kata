package com.davhal;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Basket object that holds items in an ArrayList of
 * type Item
 */
public class Basket extends Order {

    //Instance field
    ArrayList<Item> itemList;

    /**
     * Default constructor for Basket object
     */
    public Basket() {
        itemList = new ArrayList<>();
    }

    /**
     * Total cost of all items in basket
     * @return total
     */
    public double totalCost() {

        double total = 0;

        for (Item i : itemList) {
            total  = total + i.getPrice();
        }
        return total;
    }

    /**
     * Creates and returns a sorted char array of SKUs
     * @return skuArray
     */
    public char[] skuArray() {

        int e = 0;
        char[] skuArray = new char[itemList.size()];

        for (Item i : itemList) {
            skuArray[e] = i.getSku();
            e++;
        }

        Arrays.sort(skuArray);
        return skuArray;

    }

    /**
     * Prints contents of basket object
     */
    public void printBasket(){

        for (Item i : itemList) {
            System.out.println("Item Name= " + i.getItemName()
                    + ", Price= £" + String.format("%.2f", i.getPrice())
                    + ", SKU= " + i.getSku());
        }

    }

}
