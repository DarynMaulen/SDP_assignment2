package FactoryPatterns.creators.concrete_creators;

import FactoryPatterns.creators.Logistics;
import FactoryPatterns.products.concrete_products.Airplane;
import FactoryPatterns.products.Transport;

public class AirLogistics extends Logistics {
    public Transport createTransport(){
        return new Airplane();
    }
}
