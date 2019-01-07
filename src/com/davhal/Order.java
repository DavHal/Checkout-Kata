package com.davhal;

/**
 * Abstract class for specialised order types
 * to inherit from
 */
public abstract class Order {

    /**
     * Enforces subclasses have their own totalCost method
     */
    public abstract double totalCost();

}
