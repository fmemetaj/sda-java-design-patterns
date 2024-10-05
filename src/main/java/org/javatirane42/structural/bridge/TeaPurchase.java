package org.javatirane42.structural.bridge;

public class TeaPurchase implements DrinkPurchase {

    @Override
    public Drink buy(Double cost) {
        System.out.println("Buying a cup of tea for " + cost);
        return new Tea();
    }
}
