package AbstractFactoryPatterns.products.concrete_products;

import AbstractFactoryPatterns.products.abstract_products.Dialog;

public class MobileDialog implements Dialog {
    public void paint(){
        System.out.println("Mobile Dialog");
    }
}
