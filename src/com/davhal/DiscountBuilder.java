package com.davhal;

import java.util.ArrayList;

/**
 * This class builds Discount objects from strings
 * containing the discount information
 */
public class DiscountBuilder {

    ArrayList<Discount> discounts = new ArrayList<>();
    ArrayList<String> rawDiscountInfo = new ArrayList<>();

    /**
     * Default constructor
     */
    public void Discountbuilder() {

        /* This to simulate the 'x for y' rules that would come
           into program dynamically. Add further rules below
            or amend current. No validation at this time. */

        rawDiscountInfo.add("A 3 for 1.30");
        rawDiscountInfo.add("B 2 for 0.45");
    }

    /**
     * This builds the Discount objects by looping
     * through the rawDiscountList
     */
    public void buildDiscountObjects() {


        //'For each' loop
        for (String d : rawDiscountInfo) {

            //Put string into an array, space delimited
            String[] discount = d.split(" ");

            char skuEx = discount[0].charAt(0);

            int countEx = Integer.parseInt(discount[1]);

            String prepEx = discount[2];

            double offerPriceEx = Double.parseDouble(discount[3]);


            discounts.add(new Discount(skuEx, countEx, prepEx, offerPriceEx));
        }

    }

}
