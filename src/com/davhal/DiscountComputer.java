package com.davhal;

import java.util.Arrays;

public class DiscountComputer {



    //A(x) 3(y) for 150(z)
    //B 2 for 45
    //(if x.count = y) { use discount rule; amend price; }

    //Accesses the skuFrequencyCount against the skuRange??
    //Boolean for each SKU to turn deals on or off??
    //Get basic logic for current deals then build up


    /**
     * Prints an SKU frequency table of the Basket object passed
     * @param passedBasket
     */
    public static void printSkuTable(Basket passedBasket){

        char[] skuRange ="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        System.out.println(Arrays.toString(skuRange));
        System.out.println(Arrays.toString(passedBasket.skuFrequencyCount()));
    }



}
