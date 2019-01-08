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

    // This to simulate the 'x for y' rules coming into program dynamically
    // Could make a discount object for each SKU then apply discount logic for x
    // elements in discount object array? idk.
    String skuA = "A 3 for 150";
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




    public void Discount(Basket passedBasket) {

        //These discount objects would be created dynamically via an external input method
        discounts.add(new Discount('A', 3, "for", 150));
        discounts.add(new Discount('B', 2, "for", 45));

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
