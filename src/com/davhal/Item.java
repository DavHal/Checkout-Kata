package com.davhal;

/**
 * Class that holds details of an Item
 */
public class Item {

    private String itemName;
    private double price;
    private char sku;

    /**
     * Default constructor for Item object
     * @param itemName
     * @param price
     * @param sku
     */
    public Item(String itemName, Double price, char sku) {

        this.itemName = itemName;
        this.price = price;
        this.sku = sku;

    }

    /**
     * @return itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @return price;
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return sku
     */
    public char getSku() {
        return sku;
    }

    /**
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @param sku
     */
    public void setSKU(char sku) {
        this.sku = sku;
    }

    /**
     * a toString method Overriding java.lang.Object
     */
    @Override
    public String toString() {
        return getClass().getName() +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", sku=" + sku +
                '}';
    }
}
