package FactoryPatterns.products.concrete_products;

import FactoryPatterns.products.Transport;

//Air transport implementation of Transport
public class Airplane implements Transport {
    public void deliver(){
        System.out.println("Delivering by air");
    }
}
