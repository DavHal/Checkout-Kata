package com.davhal;

import java.util.ArrayList;

public class Basket extends Order {

    ArrayList<Item> itemList;

    public Basket() {
        itemList = new ArrayList<>();
    }

    /*Total cost of all items in basket
     stored within itemList List */
    public double totalCost() {

        double total = 0;

        for (Item i : itemList) {
            total  = total + i.getPrice();
        }
        return total;
    }

    /* Creates and returns char array of all SKUs
       within the basket
     */
    public char[] skuArray() {

        int e = 0;
        char[] skuArray = new char[itemList.size()];

        for (Item i : itemList) {
            skuArray[e] = i.getSku();
            e++;
        }

        return skuArray;

    }

    public void printBasket(){

    }
}
