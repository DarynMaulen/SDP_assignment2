package FactoryPatterns.products.concrete_products;

import FactoryPatterns.products.Transport;

//Sea transport implementation of Transport
public class Ship implements Transport {
    public void deliver(){
        System.out.println("Delivering by sea");
    }
}
