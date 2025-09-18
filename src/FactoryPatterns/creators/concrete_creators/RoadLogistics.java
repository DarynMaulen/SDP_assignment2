package FactoryPatterns.creators.concrete_creators;

import FactoryPatterns.creators.Logistics;
import FactoryPatterns.products.Transport;
import FactoryPatterns.products.concrete_products.Truck;

public class RoadLogistics extends Logistics {
    public Transport createTransport(){
        return new Truck();
    }
}
