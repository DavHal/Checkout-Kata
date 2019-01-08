package com.davhal;

public class DiscountRules {

    // This to simulate the 'x for y' rules that would come
    // into program dynamically
    String skuA = "A 3 for 1.30";
    String skuB = "B 2 for 45";

    /*
    Uses space as delimiter to put each string 'word' into
    string array enabling easy dynamic fetching of values
    to be used in discount expressions
    */
    String[] discountA = skuA.split(" ");
    String[] discountB = skuB.split(" ");


}
