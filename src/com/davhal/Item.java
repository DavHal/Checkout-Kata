package com.davhal;

public class Item {

    //Private fields
    private String itemName;
    private double price;
    private char sku;

    //Constructor
    public Item(String itemName, Double price, char sku) {

        this.itemName = itemName;
        this.price = price;
        this.sku = sku;

    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
    public char getSku() {
        return sku;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setSKU(char sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", sku=" + sku +
                '}';
    }
}
