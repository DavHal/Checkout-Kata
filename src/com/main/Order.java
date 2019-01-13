package com.main;

import java.math.BigDecimal;

/**
 * Abstract class for specialised order types
 * to inherit from i.e. 'Basket' or 'Checkout
 */
public abstract class Order {

    /**
     * Enforces subclasses have their own totalCost method
     */
    public abstract BigDecimal totalCost();

}
