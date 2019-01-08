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

    public char getSku() {
        return sku;
    }

    public void setSku(char sku) {
        this.sku = sku;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPreposition() {
        return preposition;
    }

    public void setPreposition(String preposition) {
        this.preposition = preposition;
    }

    public double getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(double offerPrice) {
        this.offerPrice = offerPrice;
    }
}
