package FactoryPatterns.products.concrete_products;

import FactoryPatterns.products.Transport;

//Land transport implementation of Transport
public class Truck implements Transport {
    public void deliver(){
        System.out.println("Delivering by road");
    }
}
