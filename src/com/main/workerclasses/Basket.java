package com.main.workerclasses;

import com.main.Order;
import com.main.shoppingcartobjects.Item;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Basket object that holds items in an ArrayList of
 * type Item
 */
public class Basket extends Order {

    public ArrayList<Item> itemList;

    /**
     * Default constructor for Basket object
     */
    public Basket() {
        itemList = new ArrayList<>();
    }

    /**
     * Total cost of all items in basket
     *
     * @return total
     */
    public BigDecimal totalCost() {

        BigDecimal total = new BigDecimal(0);

        for (Item i : itemList) {
            total = total.add(BigDecimal.valueOf(i.getPrice()));
        }
        return total;
    }

    /**
     * Prints the total cost of the basket
     */
    public void printTotalCost() {

        System.out.println("\n" + "Total cost of basket: £"
                + String.format("%.2f", totalCost()));
    }

    /**
     * Creates and returns a sorted char array of SKUs
     * of the items within the basket object
     *
     * @return skuArray
     */
    public char[] skusContainedInBasket() {

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
     * Will return price of item with matching SKU. If no items with
     * matching SKUs are found, will return 0;
     * @param passedSku
     * @return item price of matched SKU item OR price of found SKU item
     */
    public double getItemPrice(char passedSku) {

        for (Item i : itemList) {
            if (passedSku == i.getSku()) {
                return i.getPrice();
            }
        }

        return 0;
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

        for (int i = 0; i < skusContainedInBasket().length; i++ ) {
            int c = skusContainedInBasket()[i] - 'A';
            frequencyMap[c]++;
        }

        return frequencyMap[skuElementPosition];
    }

    /**
     * Returns the entire array of the frequency of SKUs
     * @return frequencyMap
     */
    public int[] skuFrequencyCount () {

        int[] frequencyMap = new int[26];

        for (int i = 0; i < skusContainedInBasket().length; i++ ) {
            int c = skusContainedInBasket()[i] - 'A';
            frequencyMap[c]++;
        }

        return frequencyMap;
    }

    /**
     * Prints all item details within the basket object
     */
    public void printBasket(){
        for (Item i : itemList) {
            System.out.println("Item Name= " + i.getItemName()
                    + "   "
                    + "Price= £" + String.format("%.2f", i.getPrice())
                    + "   "
                    + "SKU= " + i.getSku());
        }

    }

}
