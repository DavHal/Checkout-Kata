package com.main;

/**
 * Abstract class for specialised order types
 * to inherit from i.e. 'Basket' or 'Checkout
 */
public abstract class Order {

    /**
     * Enforces subclasses have their own totalCost method
     */
    public abstract double totalCost();

}
