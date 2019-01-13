package com.main.workerclasses;

import com.main.shoppingcartobjects.Discount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class DiscountComputer {

    ArrayList<Discount> currentDiscounts = new DiscountBuilder().discountsList;
    BigDecimal totalSavings = BigDecimal.valueOf(0);

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

    /**
     * Applies current discounts available to passed basket then
     * returns the post discount total.
     * @param passedBasket
     * @return Returns the post discount total of the passed basket
     */
    public BigDecimal applyDiscounts(Basket passedBasket) {

        // Cycle through each discount available.
       for (Discount d :currentDiscounts) {

           //How many times the discount applies to the basket
           int applyDiscountCount = (passedBasket.skuFrequencyCount(d.getSku()) / d.getCount());

           //Total of the pre-savings item total
           BigDecimal preSavingItemTotal = BigDecimal.valueOf(((passedBasket.getItemPrice(d.getSku()) * d.getCount())));

           //What the offer price is
           BigDecimal offerPrice = BigDecimal.valueOf(d.getOfferPrice());

           //How much saving a discount applied once would be
           BigDecimal savingsSingle = preSavingItemTotal.subtract(offerPrice);

           // Single savings multiplied by frequency of how many times
           // the offer appears in basket gives total savings using current discount
           BigDecimal totalDiscountSavings = savingsSingle.multiply(BigDecimal.valueOf(applyDiscountCount));

           //Adds savings to the object instance field
           totalSavings = totalDiscountSavings.add(totalSavings);
       }

       BigDecimal basketTotal = BigDecimal.valueOf(passedBasket.totalCost());

       BigDecimal postTotalDiscount = basketTotal.subtract(totalSavings);

       return postTotalDiscount;
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

    /**
     * Prints total savings message
     */
    public void totalSavingsMsg() {
        System.out.println("You saved a total of " + String.format("£%.2f", getTotalSavings()) + "!!");
    }

    /**
     * Prints total cost of basket after discount message
     * @param passedBasket
     */
    public void totalCostWithDiscountsMsg(Basket passedBasket) {
        System.out.println("Total cost of basket with discount: " + "£" + applyDiscounts(passedBasket));
    }

    /**
     * Returns the total savings BigDecimal
     * @return total savings figure
     */
    public BigDecimal getTotalSavings() {
        return totalSavings;
    }

}
