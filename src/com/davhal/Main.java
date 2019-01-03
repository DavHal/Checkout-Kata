package com.davhal;

public class Main {

    public static void main(String[] args) {

        Item[] shoppingBasket = new com.davhal.Item[6];

        shoppingBasket[0] = new com.davhal.Item("Apple", 1.52, 'A' );
        shoppingBasket[1] = new com.davhal.Item("Banana", 2.52, 'B' );
        shoppingBasket[2] = new com.davhal.Item("Apple", 1.52, 'A' );
        shoppingBasket[3] = new com.davhal.Item("Apple", 1.52, 'A' );
        shoppingBasket[4] = new com.davhal.Item("Banana", 2.52, 'B' );
        shoppingBasket[5] = new com.davhal.Item("Apple", 1.52, 'A' );

        for (Item i : shoppingBasket) {
            System.out.println("Item Name= " + i.getItemName()
                    + ", Price= £" + i.getPrice()
                    + ", SKU= " + i.getSku());
        }

    }
}
