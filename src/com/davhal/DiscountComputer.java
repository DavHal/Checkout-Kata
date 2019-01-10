package com.davhal;

import java.math.BigDecimal;
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

   public BigDecimal applyDiscounts(Basket passedBasket) {

       BigDecimal totalSavings = BigDecimal.valueOf(0);

       // Cycle through each discount available.
       for (Discount d :currentDiscounts) {

           //How many times the discount applies to the basket
           int applyDiscountCount = (passedBasket.skuFrequencyCount(d.getSku()) / d.getCount());

           //Total of the pre-savings item total
           BigDecimal preSavingItemTotal = BigDecimal.valueOf(((singleItem.getPrice() * d.getCount())));

           //What the offer price is
           BigDecimal offerPrice = BigDecimal.valueOf(d.getOfferPrice());

           //How much saving a discount applied once would be
           BigDecimal savingsSingle = preSavingItemTotal.subtract(offerPrice);

           // Single savings multiplied by frequency of how many times
           // the offer appears in basket gives total savings using current discount
           BigDecimal totalSavings = savingsSingle.multiply(BigDecimal.valueOf(applyDiscountCount));

           totalSavings = totalSavings.add(totalSavings);
                       }
                   }
               }
           }
       }

       BigDecimal basketTotal = BigDecimal.valueOf(passedBasket.totalCost());

       BigDecimal ppostTotalDiscount = basketTotal.subtract(totalSavings);

       return ppostTotalDiscount;

       //double postDiscountTotal = (passedBasket.totalCost() - totalSavings);
       //return postDiscountTotal;

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
