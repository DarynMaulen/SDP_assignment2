package FactoryPatterns.creators.concrete_creators;

import FactoryPatterns.creators.Logistics;
import FactoryPatterns.products.concrete_products.Airplane;
import FactoryPatterns.products.Transport;

//Concrete creator that produces Airplane transports
public class AirLogistics extends Logistics {
    public Transport createTransport(){
        return new Airplane();
    }
}
