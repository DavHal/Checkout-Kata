package com.davhal;

import java.util.ArrayList;
import java.util.Arrays;

public class DiscountComputer {

    /*
    A(x) 3(y) for 150(z)
    B(x) 2(y) for 45(z)
    (if x.count = y) { use discount rule; amend price using z; }

    Accesses the skuFrequencyCount against the skuRange??
    Boolean for each SKU to turn deals on or off??
    Get basic logic for current deals then build up
    Two separate objects for before and after price totals maybe?
    Retrieve values of discount dynamically first then amend price logic.


    SKU A Logic Basis pseudo
     if ('A' element in skuFrequencyCount dived Integer.parseInt(discountA[1]) <= 0){
          do nothing;
     } else {
          do something with price using discountA[3];
     }
    */

    // This to simulate the 'x for y' rules that would come
    // into program dynamically
    String skuA = "A 3 for 130";
    String skuB = "B 2 for 45";

    /*
    Uses space as delimiter to put each string 'word' into string array
    enabling dynamic fetching of values to be used in discount expressions
    */
    String[] discountA = skuA.split(" ");
    String[] discountB = skuB.split(" ");

    ArrayList<Discount> discounts = new ArrayList<>();

    /**
     * Empty default constructor
     */
    DiscountComputer(){
    }

    //Take string array and build discount object from it [A, 3, for , 150]


    public void buildDiscountObjects() {


        // Discount objects would be created dynamically to go in loop
        // for each rule
        char skuEx = discountA[0].charAt(0);
        int countEx = Integer.parseInt(discountA[1]);
        String prepEx = discountA[2];
        double offerPriceEx = Double.parseDouble(discountA[3]);

        // [A, 3, for, 150]
        discounts.add(new Discount(skuEx, countEx, prepEx, offerPriceEx));

    }


    public void Discount(Basket passedBasket) {

        int applyDiscountCount = passedBasket.skuFrequencyCount('A') / Integer.parseInt(discountA[1]);

        System.out.println(new StringBuilder()
                .append("How many times to apply discount ")
                .append("'")
                .append(skuA.toString())
                .append("'")
                .append(": ")
                .append(applyDiscountCount)
                .append(" time(s)").toString());

    }

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
