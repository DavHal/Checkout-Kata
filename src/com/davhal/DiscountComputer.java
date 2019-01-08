package com.davhal;

import java.util.Arrays;

public class DiscountComputer {

    //A(x) 3(y) for 150(z)
    //B(x) 2(y) for 45(z)
    //(if x.count = y) { use discount rule; amend price using z; }

    //Accesses the skuFrequencyCount against the skuRange??
    //Boolean for each SKU to turn deals on or off??
    //Get basic logic for current deals then build up
    //Two separate objects for before and after price totals maybe?

    //Retrieve values of discount dynamically first then amend price logic.

    // This to simulate the 'x for y' rules coming into program dynamically
    String skuA = "A 3 for 150";
    String skuB = "B 2 for 45";

    /*
    Uses space as delimiter to put each string 'word' into string array
    enabling fetching and use of values into expressions
    */
    String[] discountA = skuA.split(" ");
    String[] discountB = skuB.split(" ");

    //SKU A Logic Basis pseudo
    // if ('A' element in skuFrequencyCount dived Integer.parseInt(discountA[1]) <= 0){
    //      do nothing;
    // } else {
    //      do something with price using discountA[3];
    // }




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
