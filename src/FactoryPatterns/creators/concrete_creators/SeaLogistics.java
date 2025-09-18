package FactoryPatterns.creators.concrete_creators;

import FactoryPatterns.creators.Logistics;
import FactoryPatterns.products.concrete_products.Ship;
import FactoryPatterns.products.Transport;

//Concrete creator that produces Ship transports
public class SeaLogistics extends Logistics {
    public Transport createTransport(){
        return new Ship();
    }
}

