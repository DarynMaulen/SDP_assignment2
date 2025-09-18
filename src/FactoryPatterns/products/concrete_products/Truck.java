package FactoryPatterns.products.concrete_products;

import FactoryPatterns.products.Transport;

public class Truck implements Transport {
    public void deliver(){
        System.out.println("Delivering by road");
    }
}
