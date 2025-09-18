package FactoryPatterns.creators;

import FactoryPatterns.products.Transport;

//Abstract creator for creating Transport and planning delivery
public abstract class Logistics {
    public abstract Transport createTransport();
    public void planDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    }
}
