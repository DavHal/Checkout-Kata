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
     * This method places the frequency of SKUs in the basket within
     * int frequencyMap[] at elements 1-26 respectively of the alphabet.
     * the literal 'A' is being used as a value 'anchor' to maintain element
     * range of '1'-'26'. The method assumes SKUs will be capital chars and passed
     * chars are not validated yet.
     * @param skuLetter this is the desired SKU to return the frequency of
     * @return frequency of passed SKU within basket
     */
    public int skuFrequencyCount (char skuLetter ) {

        int skuElementPosition = skuLetter - 'A';
        int[] frequencyMap = new int[26];

        for (int i = 0; i < skuArray().length; i++ ) {
            int c = skuArray()[i] - 'A';
            frequencyMap[c]++;
        }

        return frequencyMap[skuElementPosition];
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
