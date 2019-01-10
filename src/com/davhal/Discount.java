package com.davhal;

public class Discount {

    char sku;
    int count;
    String preposition;
    double offerPrice;

    public Discount(char sku, int count, String preposition, double offerPrice) {

        this.sku = sku;
        this.count = count;
        this.preposition = preposition;
        this.offerPrice = offerPrice;
    }

    /**
     * Returns SKU of discount
     * @return
     */
    public char getSku() {
        return sku;
    }

    /**
     * Sets SKU of discount
     * @param sku
     */
    public void setSku(char sku) {
        this.sku = sku;
    }

    /**
     * Returns the required count of item to trigger discount
     * @return
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the required count of item to trigger discount
     * @return
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Returns the preposition of discount usually 'for'
     * @return
     */
    public String getPreposition() {
        return preposition;
    }

    /**
     * Sets the preposition of discount
     * @return
     */
    public void setPreposition(String preposition) {
        this.preposition = preposition;
    }

    /**
     * Gets the offer price of discount
     * @return
     */
    public double getOfferPrice() {
        return offerPrice;
    }

    /**
     * Sets the offer price of discount
     * @param offerPrice
     */
    public void setOfferPrice(double offerPrice) {
        this.offerPrice = offerPrice;
    }

    /**
     * The overriding toSting method for the discount object
     * @return
     */
    @Override
    public String toString() {
        return "Discount: " +
                "SKU= " + sku + ", " +
                count + " " +
                preposition + " " +
                String.format("£" + "%.2f", offerPrice)
                ;
    }
}
