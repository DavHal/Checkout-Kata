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

    ArrayList<Discount> currentDiscounts = new DiscountBuilder().discountsList;

    /**
     * Empty default constructor
     */
    public DiscountComputer(){
    }

    /**
     *  Prints out how many times a discount will be applied to a
     *  passed Basket Object
      * @param passedBasket
     */
    public void printDiscountsAvailable(Basket passedBasket) {

        for(Discount d : currentDiscounts) {

            //How many times the discount applies to the basket
            int applyDiscountCount = (passedBasket.skuFrequencyCount(d.getSku()) / d.getCount());

            System.out.println(new StringBuilder()
                    .append("How many times to apply discount ")
                    .append("'")
                    .append(d.getSku())
                    .append("'")
                    .append(": ")
                    .append(applyDiscountCount)
                    .append(" time(s)").toString());

        }
   }

   public double applyDiscounts(Basket passedBasket) {

       double totalSavings = 0;

       // Cycle through each discount.
       // For each relevant one, apply to total savings.
       // Minus savings from preDiscountTotal val in Basket.
       for (Discount d :currentDiscounts) {

           //How many times the discount applies to the basket
           int applyDiscountCount = (passedBasket.skuFrequencyCount(d.getSku()) / d.getCount());

           //If there are discounts, apply them
           if (applyDiscountCount > 0 ) {
               //Only apply discount by how many times it appears
               for (int i = 0; i < applyDiscountCount; i++){
                   //Go through basket items to find matching SKU then
                   // grab price of that item
                   for (Item singleItem : passedBasket.itemList) {
                       if (singleItem.getSku() == d.getSku()) {
                           double itemPrice = singleItem.getPrice();
                           double savings = itemPrice * d.getCount();
                           totalSavings = totalSavings + savings;
                       }
                   }
               }
           }
       }

       double postDiscountTotal = (passedBasket.totalCost() - totalSavings);
       return postDiscountTotal;

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
